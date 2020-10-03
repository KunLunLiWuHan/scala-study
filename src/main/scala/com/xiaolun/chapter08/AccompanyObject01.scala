package com.xiaolun.chapter08

object AccompanyObject01 {
  def main(args: Array[String]): Unit = {
    //在底层等价于ScalaPerson$.MODULE$.sex（）
    println(ScalaPerson.sex) //true
    ScalaPerson.sayHi() //hello world
  }
}

/**
 * 1、当在同一个文件中有class ScalaPerson 和 object ScalaPerson
 * 2、class ScalaPerson称为伴生类，将非静态的内容放到该类中
 * 3、object ScalaPerson称为伴生对象，将静态的内容放到该对象（类）中
 * 4、class ScalaPerson编译后，底层生成ScalaPerson类ScalaPerson.class
 * 5、object ScalaPerson编译后，底层生成ScalaPerson$类ScalaPerson$.class
 * 6、对于伴生对象的内容，我们可以直接通过ScalaPerson.属性或者方法调用
 */
//伴生类
class ScalaPerson {
  var name: String = _
}

//伴生对象
object ScalaPerson {
  var sex: Boolean = true

  def sayHi(): Unit = {
    println("hello world")
  }
}
