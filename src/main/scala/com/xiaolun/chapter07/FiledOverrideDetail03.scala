package com.xiaolun.chapter07

object FiledOverrideDetail03 {
  def main(args: Array[String]): Unit = {
    println("hello-----")
  }
}

/**
 * 在A01中有一个抽象字段（属性）
 * 1、抽象的字段或者属性就是没有初始化的字段
 * 2、当一个类含有抽象属性时，则该类需要标记为abstract
 * 3、对于抽象的属性，在底层不会生成对应的属性声明，而是生成两个对应的抽象方法（name name_$eq）
 */
abstract class A01{
  var name:String //抽象
  var age:Int = 10 //为下面的继承测试用
}

class sub_A01 extends A01{
  /**
   * 1、如果我们在子类中去重写父类的抽象方法，本质是实现了抽象方法
   * 2、因此，在这里我们可以写override，也可以不写
   */
  override var name: String = _
  //不能重写父类的定义方法
  //  override var age:Int = 20
}