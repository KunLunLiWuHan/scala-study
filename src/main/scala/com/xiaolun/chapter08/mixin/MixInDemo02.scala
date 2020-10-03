package com.xiaolun.chapter08.mixin

object MixInDemo02 {
  def main(args: Array[String]): Unit = {
    val mysql5 = new MySQL5 with DB5  with File5
    mysql5.insert(666)

    //只有File5会报错，因为super.insert(id)找到父类，
    //发现，其抽象方法未实现。
//    val mysql5 = new MySQL5 with File5
  }
}

trait Operate5 {
  def insert(id: Int)
}

trait File5 extends Operate5 {
  /**
   * 1、重写父类的抽象方法
   * def insert(id: Int): Unit = {}
   * 其中super.insert(id) 会报错
   * 2、如果我们在子特质中重写/实现了一个父类的
   * 抽象方法，但是同时调用了super方法，没有方法的具体实现，无法编译通过，
   * 为了避免这种情况的发生。可重写抽象方法abstract override
   * 这样在使用时，就必须考虑动态混入的顺序问题。
   * 3、这样写的作用：这时super.insert(id)的调用就和动态混入顺序有密切关系
   */
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中..")
    super.insert(id)
  }
}

trait DB5 extends Operate5 {
  def insert(id: Int): Unit = {
    println("将数据保存到数据库中..")
  }
}

class MySQL5 {}

