package com.xiaolun.actor

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

class SayHelloActor extends Actor {
  //说明
  //1. receive方法，会被该Actor的MailBox(实现了Runnable接口)调用
  //2. 当该Actor的MailBox 接收到消息,就会调用 receive
  //3. type Receive = PartialFunction[Any, Unit] （偏函数）
  override def receive: Receive = {
    case "hello" => println("收到hello, 回应hello too:)")
    case "ok" => println("收到ok, 回应ok too:)")
    case "exit" => {
      println("接收到exit指令，退出系统")
      context.stop(self) //停止actorref(self:本身)
      context.system.terminate() //退出actorsystem
    }
    case _ => println("匹配不到")
  }
}

object SayHelloActorDemo {

  //1. 先创建一个ActorSystem, 专门用于创建Actor
  private val actoryFactory = ActorSystem("actoryFactory")
  //2. 创建一个Actor的同时，返回Actor的ActorRef
  //   说明
  //(1) Props[SayHelloActor] 创建了一个 SayHelloActor实例，使用反射
  //(2) "sayHelloActor" 给actor取名
  //(3) sayHelloActorRef: ActorRef 就是 Props[SayHelloActor] 对应的ActorRef
  //(4) 创建的SayHelloActor 实例被ActorSystme接管
  private val sayHelloActorRef: ActorRef = actoryFactory.actorOf(Props[SayHelloActor], "sayHelloActor")

  def main(args: Array[String]): Unit = {

    /**
     * 1、给SayHelloActor 发消息(邮箱)
     * 2、sayHelloActorRef表示发给谁
     */
    sayHelloActorRef ! "hello"
    sayHelloActorRef ! "ok"
    sayHelloActorRef ! "ok~"
    //研究异步如何退出ActorSystem
    sayHelloActorRef ! "exit"
  }
}
