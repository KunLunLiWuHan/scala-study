package com.xiaolun.chapter09

object ImplicitDemo02 {
  def main(args: Array[String]): Unit = {
    //编写一个隐式函数，丰富mysql功能
    implicit def addDelete(mysql: MySQL): DB = {
      new DB
    }

    //创建对象
    val mysql = new MySQL
    mysql.insert()
    mysql.delete()
  }
}

class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }
}
