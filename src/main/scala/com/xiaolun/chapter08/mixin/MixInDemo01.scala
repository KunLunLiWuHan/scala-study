package com.xiaolun.chapter08.mixin

object MixInDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 1、在不修改类的定义的基础上，让他们可以使用trait方法
     */
    var oracle = new OracleDB with Operate3
    oracle.insert(999)

    //MySQL3为抽象类，没有抽象的方法
    val mysql = new MySQL3 with Operate3
    mysql.insert(4)

    //如果抽线类中含有抽象方法，在实现动态混入特质的过程中需要
    //按照下面的顺序实现抽象方法。
    val mysql2 = new MySQL3_ with Operate3 {
      override def say(): Unit = {
        println("say....")
      }
    }
    mysql2.insert(12)
    mysql2.say()
  }
}

trait Operate3 { //特质
  def insert(id: Int): Unit = { //方式（实现）
    println("插入数据 = " + id)
  }
}

class OracleDB {
}

abstract class MySQL3 {
}

//含有抽象方法
abstract class MySQL3_ {
  def say()
}
