package com.xiaolun.chapter13

object PartialFunDemo03 {
  def main(args: Array[String]): Unit = {
    //使用偏函数解决
    val list = List(1, 2, 3, 4, "abc")
    /**
     * 1、定义一个偏函数
     * 2、PartialFunction[Any, Int]表示接收类型是Any,
     * 返回类型是Int
     * 3、def isDefinedAt(any: Any) 如果返回true，就去调用
     * apply构建一个对象实例，反之，apply不执行，x会被过滤掉（对象也不构建）
     * 4、 def apply(any: Any) 其中的any是接收来自isDefinedAt中的x的值，
     * 并执行相应逻辑后（+1返回）并返回到一个新的集合addOne3。
     */
    val addOne3 = new PartialFunction[Any, Int] {
      def isDefinedAt(x: Any) = if (x.isInstanceOf[Int]) true else false

      def apply(any: Any) = any.asInstanceOf[Int] + 1
    }
    /**
     * 1、如果使用偏函数，不能使用map
     * 应该使用collect
     */
    val list3 = list.collect(addOne3)
    println("list3=" + list3)
  }
}
