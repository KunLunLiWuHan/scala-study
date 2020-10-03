package com.xiaolun.chapter10

object MultiplyArray {
  def main(args: Array[String]): Unit = {

    //创建
    val array1 = Array.ofDim[Int](3, 4)
    array1(1)(1) = 9
    //取出二维数组的各个元素（一维数组）
    for (item <- array1) {
      //一维数组遍历
      for (item2 <- item) {
        print(item2 + "\t")
      }
      println()
    }

    println("===================")
    //传统方式遍历
    for (i <- 0 to array1.length - 1) {
      for (j <- 0 to array1(i).length - 1) {
        printf("arr[%d][%d]=%d\t", i, j, array1(i)(j))
      }
      println()
    }
  }
}
