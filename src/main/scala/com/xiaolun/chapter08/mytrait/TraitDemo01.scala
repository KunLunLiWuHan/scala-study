package com.xiaolun.chapter08.mytrait

object TraitDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

//trait Serializable extends Any with java.io.Serializable
//在scala中，java的接口都可以当作trait来使用
object T1 extends Serializable {
}