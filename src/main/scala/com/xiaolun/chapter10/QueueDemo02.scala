package com.xiaolun.chapter10

import scala.collection.mutable

object QueueDemo02 {
  def main(args: Array[String]): Unit = {
    val q1 = new mutable.Queue[Int]
    q1 += 12
    q1 += 34
    q1 ++= List(2, 9)
    println(q1) //Queue(12, 34, 2, 9)

    //从队列头开始删除
    val queueElement = q1.dequeue()
    println("queueElement="+queueElement) //取出元素12
    println(q1)//Queue(34, 2, 9)
    //从尾部入队列
    val queueElement2 = q1.enqueue(20, 60)
    println("queueElement="+queueElement2) //()
    println(q1) //Queue(34, 2, 9, 20, 60)
    println(q1.head) //34
    println(q1.last) //60
    println(q1.tail) //Queue(2, 9, 20, 60)
    println(q1.tail.tail) //Queue( 9, 20, 60)
  }
}
