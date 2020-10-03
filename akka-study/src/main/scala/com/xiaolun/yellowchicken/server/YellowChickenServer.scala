package com.xiaolun.yellowchicken.server

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import com.xiaolun.yellowchicken.common.{ClientMessage, ServerMessage}

class YellowChickenServer extends Actor {
  override def receive: Receive = {
    case "start" => println("start 小黄鸡客服开始工作了....")
    //如果接收到ClientMessage
    case ClientMessage(mes) => {
      /**
       * 1、使用match --case中的模糊匹配
       * 也可以使用模糊匹配。
       */
      mes match {
        case "大数据学费" => sender() ! ServerMessage("35000RMB")
        case "学校地址" => sender() ! ServerMessage("北京昌平xx路xx大楼")
        case "学习什么技术" => sender() ! ServerMessage("大数据 前端 python")
        case _ => sender() ! ServerMessage("你说的啥子~")
      }
    }
  }
}

//主程序-入口
object YellowChickenServer extends App {

  val host = "127.0.0.1" //服务端ip地址
  val port = 9999
  //创建config对象,指定协议类型，监听的ip和端口
  val config = ConfigFactory.parseString(
    s"""
       |akka.actor.provider="akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.hostname=$host
       |akka.remote.netty.tcp.port=$port
        """.stripMargin)

  /**
   * 1、创建ActorSystem
   * 2、url (统一资源定位)，actor是一个资源
   * 3、Server是actor的名字
   * 4、YellowChickenServer是serverActorSystem的名字
   * 5、config需要将ip和host带进去（单机版不需要指定）
   */
  val serverActorSystem = ActorSystem("Server", config)
  //创建YellowChickenServer 的actor和返回actorRef
  val yellowChickenServerRef: ActorRef = serverActorSystem.actorOf(Props[YellowChickenServer], "YellowChickenServer")

  //给自己先发一个消息，让自己启动
  yellowChickenServerRef ! "start"
}