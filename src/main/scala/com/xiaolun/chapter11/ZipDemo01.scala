package com.xiaolun.chapter11

object ZipDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)
    //拉链
    val list3 = list1.zip(list2)
    //对偶元组：List((1,4), (2,5), (3,6))
    println("list3=" + list3)

    //如果要取出合并后的各个对偶元组的数据，可以遍历
    for(item<-list3){
      println(item._1 + " " + item._2) //取出时，按照元组的方式取出即可
    }

  }
}
