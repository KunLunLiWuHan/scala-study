package com.xiaolun.chapter08.mixin

object SelfType {
  def main(args: Array[String]): Unit = {

  }
}

/**
 * 1、 Logger就是自身类型特质，当这里做了自生类型后
 * 等价于trait Logger extends Exception,要求混入该特质的类
 * 也是Exception的子类
 */
trait Logger {
  // 明确告诉编译器，我就是Exception,如果没有这句话，下面的getMessage不能调用
  this: Exception =>
  def log(): Unit = {
    // 既然我就是Exception, 那么就可以调用其中的方法
    println(getMessage)
  }
}

/**
 * 1、报错，因为Console不是Exception的子类
 * 2、Logger中已声明了
 */
//class Console extends Logger {}

//先继承Exception，让其称为其子类，才能够识别。
class Console extends Exception with Logger


