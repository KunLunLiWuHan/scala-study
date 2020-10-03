package com.xiaolun.chapter05.recursive

object Demo01 {
  def main(args: Array[String]): Unit = {
    test(4)
  }
  def test (n: Int) {
    if (n > 2) {
      test (n - 1)
    }
    println("n=" + n)
  }

  //Unit也不写
  def getsum2(n1: Int,n2: Int){
    return n1 + n2
  }
}
