package com.xiaolun.chapter08.mytrait

object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    val t = new Sheep()
    t.sayHi()
    t.sayHello()

  }
}

/**
 * 1、当一个trait有抽象方法和非抽象方法时
 * 一个trait在底层对应两个 Trait01.class(接口)，
 * Trait01$class.class  Trait01$class 抽象类
 * 2、当在sheep类中要使用Trait01的实现的方法，通过Trait01$class
 */
trait Trait01 {
  //抽象方法
  def sayHi()

  //实现的普通方法
  def sayHello(): Unit = {
    println("Trait02 sayHello.....")
  }
}

class Sheep extends Trait01 {
  override def sayHi(): Unit = {
    println("T1 sayOk.....")
  }
}