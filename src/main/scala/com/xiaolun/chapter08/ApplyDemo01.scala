package com.xiaolun.chapter08

object ApplyDemo01 {
  def main(args: Array[String]): Unit = {

    val pig1 = new Pig("小花")

    //使用apply方法来创建对象
    val pig2 = Pig("小黑猪") //自动触发apply(pName: String)
    val pig3 = Pig() // apply()

    println("pig1.name" + pig1.name)
    println("pig2.name" + pig2.name)
    println("pig3.name" + pig3.name)

  }
}

class Pig(pName: String) {
  var name: String = pName
}

object Pig {
  //编写一个apply 在伴随对象中使用，为类或特征提供一个不错的工厂方法
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("pig2")
}