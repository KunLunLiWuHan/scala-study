package com.xiaolun.chapter18.upperbounds

object lowerboundsTest01 {
  def main(args: Array[String]): Unit = {
    val parent = new AParent01()
    parent.sayHello()

    val child = new BChild()
    child.sayHello()

    val parent2:AParent01 = new BChild()
    parent2.sayHello() //child sayHello

//    val child2:BChild = new AParent01()
//    child2.sayHello() //child sayHello

  }
}

class AParent01 {
  def sayHello(): Unit ={
    println("Parent sayHello")
  }
}

class BChild extends AParent01{
  override def sayHello(): Unit = {
    println("child sayHello")
  }
}