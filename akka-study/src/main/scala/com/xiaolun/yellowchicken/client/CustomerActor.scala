package com.xiaolun.yellowchicken.client

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import com.xiaolun.yellowchicken.common.{ClientMessage, ServerMessage}

import scala.io.StdIn

class CustomerActor(serverHost: String, serverPort: Int) extends Actor {
  //定义一个YellowChickenServerRef
  var serverActorRef: ActorSelection = _

  /**
   * 1、在Actor中有一个方法PreStart方法，他会在actor运行前执行
   * 2、在akka的开发中，通常将初始化的工作，放在preStart方法
   * 3、Server@${serverHost}中的Server对应YellowChickenServer的 actor名字
   * 4、/user/YellowChickenServer 添加路径
   */
  override def preStart(): Unit = {
    println("preStart() 执行")

    /**
     * 1、找到YellowChickenServer服务器
     * 2、serverActorRef=ActorSelection[Anchor(akka.tcp://Server@127.0.0.1:9999/), Path(/user/YellowChickenServer)]
     */
    serverActorRef = context.actorSelection(s"akka.tcp://Server@${serverHost}:${serverPort}/user/YellowChickenServer")
    println("serverActorRef=" + serverActorRef)
  }

  override def receive: Receive = {
    case "start" => println("start,客户端运行，可以咨询问题")
    case mes: String => {
      /**
       * 1、真正的转发给小黄鸡客服。
       * 2、使用ClientMessage case class apply
       * 因为样例类默认会实现apply方法。
       */
      serverActorRef ! ClientMessage(mes)
    }
    //如果接收到服务器的回复
    case ServerMessage(mes) => {
      println(s"收到小黄鸡客服(Server): $mes")
    }
  }
}

//主程序-入口
object CustomerActor extends App {

  val (clientHost, clientPort, serverHost, serverPort) = ("127.0.0.1", 9990, "127.0.0.1", 9999)
  val config = ConfigFactory.parseString(
    s"""
       |akka.actor.provider="akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.hostname=$clientHost
       |akka.remote.netty.tcp.port=$clientPort
        """.stripMargin)

  //创建ActorSystem
  val clientActorSystem = ActorSystem("client", config)

  //创建CustomerActor的实例和引用
  val customerActorRef: ActorRef = clientActorSystem.actorOf(Props(new CustomerActor(serverHost, serverPort)),
    "CustomerActor")

  //启动customerRef/也可以理解启动Actor
  customerActorRef ! "start"

  //客户端可以发送消息给服务器
  while (true) {
    println("请输入要咨询的问题")
    val mes = StdIn.readLine()
    customerActorRef ! mes
  }
}
