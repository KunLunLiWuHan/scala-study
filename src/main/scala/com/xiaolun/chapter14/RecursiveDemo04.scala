package com.xiaolun.chapter14

object RecursiveDemo04 {
  def main(args: Array[String]): Unit = {
    var count = BigInt(0)
    println(fbn(21))
    //fbn(20) -> 13529;fbn(21) -> 21891
    println("使用fbn次数为：" + count)

    def fbn(n: BigInt): BigInt = {
      count += 1
      if (n == 1 || n == 2) 1
      //使用递归，重复计算时，需要考虑优化-》迭代
      else fbn(n - 1) + fbn(n - 2)
    }
  }
}
