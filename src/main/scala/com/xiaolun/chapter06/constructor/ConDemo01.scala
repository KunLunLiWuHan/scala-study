package com.xiaolun.chapter06.constructor

object ConDemo01 {
  def main(args: Array[String]): Unit = {
    //1、主构造器
    val p1 = new Person("tom",10)
    println(p1.toString)

    //2、辅助构造器,会调用def this(name: String)
    val p2 = new Person("xiaohei")
    println(p2.toString)
  }
}

class Person(inName: String,inAge: Int){

  var name: String = inName
  var age: Int = inAge

  override def toString: String = {
    "name = " + this.name + "\t age = " + this.age
  }

  //辅助构造器
  def this(name: String){
    /**
     * 1、辅助构造器，必须在第一行显式调用主构造器（这点和java一样）
     * 2、（先执行主构造器的内容，后执行辅助构造器的内容，假如主构造器A继承B类，程序会先B，再主构造器A，后辅助构造器A）
     * 其根本原因是实现子类（主构造器A）和父类（B）的关系。
     */
    this("jack01",20)
    this.name = name
  }
}
