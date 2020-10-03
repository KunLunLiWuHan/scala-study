package com.xiaolun.chapter02

object UnitNullNothing {
  def main(args: Array[String]): Unit = {
    var res = sayHello()
    //输出为()
    println("res=" + res)

    //null可以赋值给AnyRef
    val dog: Dog = null
    //报错，不能赋值给AnyVal
    //    val char1:Char =null

    var b: Byte = 10
    var c: Char =90
    //报错，int不能转换为long
//    var s: Short = b + c
//    var s2: Short = 10 + 90
    //正确
    var s3: Short = 100

    var num1: Int = 10 * 3.5.toInt + 6*1.5.toInt
    var num2: Int = (10 * 3.5 + 6*1.5).toInt
    println(num1 + "-----" + num2)

    var char2: Char = 1
    var num3:Int = 1
    //报错
//    var char3: Char = num3

  }

  def sayHello(): Unit = {

  }
}

class Dog {
}