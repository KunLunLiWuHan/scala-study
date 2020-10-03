package com.xiaolun.chapter11

object HigOrderFunDemo03 {
  def main(args: Array[String]): Unit = {
    val list1 = List(3, 5, 7)

    def f1(n1: Int): Int = {
      2 * n1
    }

    //map映射
    /**
     * list1.map(f1)说明
     * 1、将list集合元素依次遍历
     * 2、将各个元素传递给f1函数
     * 3、返回一个新的int值，将得到的新的int
     * 放入到一个新的集合中并返回
     */
    val list2 = list1.map(f1)
    println(list2)

    println("----------------------------------")
    /**
     * 模拟实现map映射函数的机制
     */
    val myList = MyList()
    val myList2 = myList.map(f1)
    println("myList2=" + myList2)
  }

}

//底层模拟代码
class MyList {
  //将集合在这里写死，正常的话，应该是读取list集合
  var list1 = List(3, 5, 7)
  var list2 = List[Int]()

  def map(f: Int => Int): List[Int] = {
    for (item <- list1) {
      list2 = list2 :+ f(item)
    }
    list2
  }
}

object MyList {
  def apply(): MyList = new MyList()
}
