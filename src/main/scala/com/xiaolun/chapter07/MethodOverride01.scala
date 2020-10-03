package com.xiaolun.chapter07

object MethodOverride01 {
  def main(args: Array[String]): Unit = {
    val emp = new Emp()
    emp.printName()
  }
}

class Person {
  var name: String = "tom"

  def printName() {
    println("Person printName() " + name)
  }
}

//这里我们继承了person
class Emp extends Person {
  /**
   * 1、这里需要显式的使用override
   * 2、如果子类在方法上使用了和父类相同的名称，
   *    子类需要添加关键字override
   * 3、在子类中需要调用父类的方法，使用关键字
   * super
   */
  override def printName() {
    println("Emp printName() " + name)
    super.printName()
  }
}
