package com.xiaolun.chapter10

object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    /**
     * 1、使用的是object Array的apply
     * 2、直接初始化数组，给了整数和“”，数组的泛型为Any
     */
    var arr02 = Array(1, 3, "xxx")
    for (i <- arr02) {
      println(i)
    }

    //可以使用我们传统方式遍历，使用下标的方式遍历
    for(index <- 0 until arr02.length){
      println(arr02(index))
    }
  }
}
