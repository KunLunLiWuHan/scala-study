package com.xiaolun.chapter07

object NoNameDemo01 {
  def main(args: Array[String]): Unit = {
    var monster = new Monster {
      override var name: String = "牛魔王"

      override def cry(): Unit = {
        println("牛魔王哼哼叫唤..")
      }
    }
    println(monster.name)
    monster.cry()
  }

}

abstract class Monster {
  var name: String

  def cry()
}
