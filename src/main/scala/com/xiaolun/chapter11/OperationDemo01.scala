package com.xiaolun.chapter11

object OperationDemo01 {
  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2

    //中置操作符,等价于上面
    val r2 = n1.+(n2)
    println("r1=" + r1 + " r2=" + r2)
    val dog = new Dog1
    dog.+(90)
    println("dog.age=" + dog.age) // 0 + 90 =90

    // 对操作符进行后置操作
    println(dog.++)
    println("dog.age=" + dog.age)

    //对操作符进行前置操作
    !dog
    println("dog.age=" + dog.age)
  }
}

class Dog1 {
  var age: Int = 0

  //对操作符进行重载(中置操作符)
  def +(n: Int): Unit = {
    this.age += n
  }

  //对操作符进行后置操作
  def ++(): Unit = {
    this.age += 1
  }

  //  对操作符进行前置操作（一元运算符）
  def unary_!(): Unit = {
    this.age = - this.age
  }
}