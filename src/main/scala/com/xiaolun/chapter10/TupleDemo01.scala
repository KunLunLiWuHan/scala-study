package com.xiaolun.chapter10

object TupleDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 创建
     * 1、tuple1是一个Tuple，类型是Tuple5
     * 2、为了高效地操作元组，编译器根据元素地个数不同，
     * 会对应不同地元组类型。
     * 分别是：Tuple1....Tuple22
     */
    val tuple1 = (1, 2, 3, "hello", 4)
    println(tuple1)
  }
}
