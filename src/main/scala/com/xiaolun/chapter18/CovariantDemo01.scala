package com.xiaolun.chapter18

class CovariantDemo01 {
  def main(args: Array[String]): Unit = {
    //1、Temp3[A]不变测试
    //    val t1: Temp3[Super11] = new Temp3[Sub11]("hello world1") //报错，因为类型是不变
    //    var t2:Temp3[Sub11] = new Temp3[Sub11]("hello") //ok
    //2、Temp3[+A]协变测试
    //    val t3: Temp3[Super11] = new Temp3[Sub11]("hello world1") //ok
    //    var t4: Temp3[Sub11] = new Temp3[Sub11]("hello") //ok
    //    val t5: Temp3[Sub11] = new Temp3[Super11]("hello world1") //报错,不支持逆变

    //3、Temp3[-A]逆变测试
    //    val t6: Temp3[Super11] = new Temp3[Sub11]("hello world1") //报错
    var t7: Temp3[Sub11] = new Temp3[Sub11]("hello") //ok
    val t8: Temp3[Sub11] = new Temp3[Super11]("hello world1") //ok,支持逆变
  }
}

//不变
//class Temp3[A](title: String) { //Temp3[+A] //Temp[-A]
//  override def toString: String = {
//    title
//  }
//}

//协变
//class Temp3[+A](title: String) {
//  override def toString: String = {
//    title
//  }
//}

//逆变
class Temp3[-A](title: String) {
  override def toString: String = {
    title
  }
}

//支持协变
class Super11 //父类
class Sub11 extends Super11
