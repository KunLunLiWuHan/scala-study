package com.xiaolun.chapter18.upperbounds

object UpperBoundsDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 1、new CompareComm(20, 30)并没有实现Comparable接口，会报错
     * 2、Integer.valueOf(20) 中的 Integer实现了Comparable接口（是其子类型），
     * 可以进行比较
     */
    //    val compareComm1 = new CompareComm(20, 30)
    //    println(compareComm1.greater)

    val compareComm2 =
    new CompareComm(Integer.valueOf(20), Integer.valueOf(30))
    println(compareComm2.greater)

    val compareComm3 =
      new CompareComm(java.lang.Float.valueOf(20.1f), java.lang.Float.valueOf(30.1f))
    println(compareComm3.greater)

    //简单的语法（隐式转换）
    val compareComm4 =
      new CompareComm[java.lang.Float](201.9f, 30.1f)
    println(compareComm4.greater)
  }
}

/**
 * 1、传统方法实现比较
 * 2、你可以写Int和Float来完成
 */
class CompareInt(n1: Int, n2: Int) {
  //返回较大的值
  def greater = if (n1 > n2) n1 else n2
}

/**
 * 泛型方式实现
 * 1、T <: Comparable[T] 表示输入的类型T实现了 Comparable[T]接口的类型，
 * 即你传入的T类型要继承Comparable接口
 * 2、obj1.compareTo(obj2) ，obj1实现了Comparable，所以可以直接调用
 * compareTo方法
 * 3、该方法通用性比传统方法要好
 */
class CompareComm[T <: Comparable[T]](obj1: T, obj2: T) {
  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
