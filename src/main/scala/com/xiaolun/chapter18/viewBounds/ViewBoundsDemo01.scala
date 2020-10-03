package com.xiaolun.chapter18.viewBounds

object ViewBoundsDemo01 {
  def main(args: Array[String]): Unit = {
    //简洁写法
    val compareComm1 = new CompareComm(20, 30)
    println(compareComm1.greater)
  }
}

/**
 * 1、[T <% Comparable[T]] 说明 T是Comparable子类型
 * 2、视图界定和[T <: Comparable[T]]区别：视图界定支持隐式转换。
 * 即视图界定支持[T <: Comparable[T]]写法，还支持简洁的写法
 */
class CompareComm[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
