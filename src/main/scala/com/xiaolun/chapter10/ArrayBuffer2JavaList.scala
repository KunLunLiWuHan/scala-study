package com.xiaolun.chapter10

import scala.collection.mutable.ArrayBuffer

object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {
    // Scala集合和Java集合互相转换
    val arr = ArrayBuffer("1", "2", "3")

    import scala.collection.JavaConversions.bufferAsJavaList
    //ProcessBuilder 用到 bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    //arrList为java中的arrList
    val arrList = javaArr.command()
    println(arrList) //输出 [1, 2, 3]


    println("-----------------------")
    //java的list转scala的buffer
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable
    // java.util.List ==> Buffer
    val scalaArr: mutable.Buffer[String] = arrList
    scalaArr.append("jack")
    println(scalaArr)

  }
}
