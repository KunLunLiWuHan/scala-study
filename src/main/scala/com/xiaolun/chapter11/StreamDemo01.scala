package com.xiaolun.chapter11

object StreamDemo01 {
  def main(args: Array[String]): Unit = {
    val stream1 = numsForm(1)
    println(stream1) //Stream(1, ?)
    //取出第一个元素
    println("head=" + stream1.head) //head=1
    println(stream1.tail) //触发操作，获取：Stream(2, ?)
    println(stream1) //Stream(1, 2, ?)

    //使用map映射stream的元素并进行一些计算
    println(numsForm(5).map(multi)) //(25,?)

  }

  /**
   * 说明；创建Stream
   * （1）Stream 集合存放的数据类型是BigInt
   * （2）numsForm 是自定义的一个函数，函数名是程序员指定的。
   * （3）创建的集合的第一个元素是 n , 后续元素生成的规则是 n + 1
   * （4）后续元素生成的规则是可以程序员指定的 ，比如 numsForm( n * 4)...
   */
  def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)

  //创建Stream2
  def multi(x: BigInt): BigInt = {
    x * x
  }

}
