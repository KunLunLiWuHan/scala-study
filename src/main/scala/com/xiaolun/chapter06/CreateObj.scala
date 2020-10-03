package com.xiaolun.chapter06

object CreateObj {
  def main(args: Array[String]): Unit = {
    //emp类型就是Emp
    val emp = new Emp
    //如果我们希望子类对象交给父类的引用，这时就需要加上类型
    //此时emp2类型是Person
    val emp2: Person = new Emp



  }
}

class Person {
}

class Emp extends Person {
}