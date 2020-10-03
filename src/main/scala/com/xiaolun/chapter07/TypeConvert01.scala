package com.xiaolun.chapter07

object TypeConvert01 {
  def main(args: Array[String]): Unit = {

    // 获取对象类型
    println(classOf[String]) //java.lang.String
    val s = "zhangsan"
    println(s.getClass.getName) //java.lang.String
    println(s.isInstanceOf[String]) //true
    //将s显式转换成String
    println(s.asInstanceOf[String])

//    var p = new Person2
    //假设emp继承Person2类
//    val e = new Emp
    //将子类引用给父类（向上转型，自动）
//    p = e
      //将父类引用重新转换成子类引用（多态），向下转型，可以使用子类的方法
//    p.asInstanceOf[Emp].sayHi()
  }
}