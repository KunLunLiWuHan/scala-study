package com.xiaolun.chapter08.mixin


object AddTraits {
  def main(args: Array[String]): Unit = {
    /**
     * 1、创建mysql实例时，动态混入DB4和File4
     * 当我们创建一个动态混入对象时，其顺序从左到右
     * 输出：Operate4... -》 Data4 -》DB4 -》File4
     * （虽说继承了Data4但是不会走两遍父类）
     */
    val mySQL = new MySQL4 with DB4 with File4
    println("----------------")

    /**
     * 1、当我们执行一个动态混入对象的方法，其执行顺序从右到左（栈）
     * 当执行super时，是指左边的特质（动态混入特质）DB4；
     * 如果在左边无特质，则该super就是父特质
     * 向文件 -》 (执行super) 向数据库 -> (执行super,没找到) 插入数据：100
     */
    mySQL.insert(100)

  }
}

trait Operate4 {
  println("Operate4...")

  def insert(id: Int)
}

trait Data4 extends Operate4 {
  println("Data4")

  //实现insert方法
  override def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}

//特质，继承Data4
trait DB4 extends Data4 {
  println("DB4")

  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}

trait File4 extends Data4 {
  println("File4")

  override def insert(id: Int): Unit = {
    println("向文件")

    /**
     * 1、调用了insert方法
     * 2、这里的super在动态混入时，不一定是父类
     */
    super.insert(id)
  }
}

//普通类
class MySQL4 {}
