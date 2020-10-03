package com.xiaolun {
  /**
   * 在包中直接
   * 1、每个包都可以有一个包对象，且只能有一个。需要在父包(com.xiaolun)中定义它,且名称与子包一样。
   * 2、package object scala 表示创建一个包对象scala,对应com.xialun.scala这个包对应的包对象。
   * 3、在包对象中定义的变量和方法，就可以在对应的包中使用。
   */
  package object scala {
    var name = "jack"

    def sayOk(): Unit = {
      println("package object sayOk!")
    }
  }

  package scala {

    //在包中直接写方法或者定义变量，直接报错。我们需要使用上面定义的包对象来解决。
    //val name = "king"
    //def sayOk(){}

    class Test {
      def test(): Unit = {
        //这里的name就是包对象scala中声明的name
        println(name)
        sayOk() //这个sayOk 就是包对象scala中声明的sayOk
      }
    }

    object TestObj {
      def main(args: Array[String]): Unit = {
        val t = new Test()
        t.test()
        //因为TestObje和scala这个包对象在同一包，因此也可以使用
        println("name=" + name)
      }
    }
  }
}
