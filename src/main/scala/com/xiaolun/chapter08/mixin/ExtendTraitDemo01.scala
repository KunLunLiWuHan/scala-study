package com.xiaolun.chapter08.mixin

object ExtendTraitDemo01 {
  def main(args: Array[String]): Unit = {
  }
}

/**
 * 1、LoggedException继承了Exception，则
 * LoggedException可以使用Exception中的一些功能
 */
trait LoggedException extends Exception {
  def log(): Unit = {
    // 方法来自于Exception类
    println(getMessage())
  }
}

//UnhappyException 就是Exception的子类.
class UnhappyException extends LoggedException {
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}

/**
 * 1、如果混入该特质(LoggedException)的类（UnhappyException2），已经继承了
 * 另一个类(IndexOutOfBoundsException)，
 * 则要求IndexOutOfBoundsException类是特质超类(Exception)的子类，
 * 否则就会出现了多继承现象，发生错误。
 */
class UnhappyException2 extends IndexOutOfBoundsException with LoggedException {
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}

//class C1{
//}
//报错，C1不是LoggedException特质的超类的子类
//class UnhappyException3 extends C1 with LoggedException {
//  override def getMessage = "错误消息！"
//}