package com.xiaolun.chapter12

object SalesDemo02 {
  def main(args: Array[String]): Unit = {
    val sale = Bundle("书籍", 10, Book("漫画", 40),
      Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))
    var res = price(sale)
    println("res = "+res) //120.0
  }

  def price(it: Item): Double = {
    it match {
      case Book(_, p) => p
      /**
       * 1、生成一个新的集合,_是将its中每个循环的元素传递到price中it中。
       * 递归操作。
       */
      case Bundle(_, disc, its@_*) => its.map(price _).sum - disc
    }
  }
}
