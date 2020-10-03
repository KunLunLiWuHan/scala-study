package com.xiaolun.chapter18

object GenericDemo01 {
  def main(args: Array[String]): Unit = {

    //传入参数时，类型已经确定了，不能乱传了
    val mes1 = new StrMessage[String]("10")
    println(mes1.get)
    val mes2 = new IntMessage[Int](20)
    println(mes2.get)
  }
}

// 在 Scala 定义泛型用[T]， s 为泛型的引用
abstract class Message[T](s: T) {
  def get: T = s
}

/**
 * 1、子类扩展的时候，约定了具体的类型
 * 2、Message(msg)中的msg类型不用在写了
 * 在父类中已经定义了
 */
class StrMessage[String](msg: String) extends Message(msg)

class IntMessage[Int](msg: Int) extends Message(msg)
