package com.xiaolun.chapter10

import scala.collection.mutable

object QueueDemo01 {
  def main(args: Array[String]): Unit = {
//    import scala.collection.mutable
//    //说明: 这里的Int是泛型，表示q1队列只能存放Int类型
//    //如果希望q1可以存放其它类型，则使用 Any 即可。
//    val q1 = new mutable.Queue[Int]
//    println(q1)



    val q1 = new mutable.Queue[Int]
//    给队列添加元素
    q1 += 20
    println(q1)  //Queue(20)
//    拆开后相加，默认数据加在队列的后面
    q1 ++= List(2,4,6) //Queue(20, 2, 4, 6)
    println(q1)

    //表示将List(1,2,3)作为一个元素存入到队列中
//     val q1 = new mutable.Queue[Any] //下面的编译可以通过
//    q1 += 20
//    q1 += List(1,2,3) //泛型为Any才ok，Queue(20, List(1, 2, 3))
//    println(q1)

  }
}
