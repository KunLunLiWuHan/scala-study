package com.xiaolun.actors

import akka.actor.{ActorRef, ActorSystem, Props}

//100招后，就退出（）
//调用
object ActorGame extends App {
  //创建ActorSystem
  val actorfactory = ActorSystem("actorfactory")
  /**
   * 1、先创建BActor引用/代理，再创建AActor的引用
   * 因为A需要BActorRef的一个引用的。
   * 2、创建AActor的引用需要根据AActor的构造器来创建。
   */
  val bActorRef: ActorRef = actorfactory.actorOf(Props[BActor], "bActor")
  val aActorRef: ActorRef = actorfactory.actorOf(Props(new AActor(bActorRef)), "aActor")

  //aActor出招，触发动作
  aActorRef ! "start"
}
