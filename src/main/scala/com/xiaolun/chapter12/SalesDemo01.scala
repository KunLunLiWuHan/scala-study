package com.xiaolun.chapter12

object SalesDemo01 {
  def main(args: Array[String]): Unit = {
    //给出案例表示有一捆数，单本漫画（40-10） +文学作品(两本书)（80+30-20） = 30 + 90 = 120.0
    val sale = Bundle("书籍", 10, Book("漫画", 40),
      Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))

    //知识点补充1：将desc绑定到第一个Book的描述。
    val res = sale match {
      //如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有
      case Bundle(_, _, Book(desc, _), _*) => desc
    }
    //res = 漫画
    println("res = " + res)

    println("---------------------------")
    /**
     * 1、知识点补充2：通过@表示法将嵌套的值绑定到变量。
     * 2、Book("漫画", 40),
     * Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30))
     * 绑定到指定变量（变量名任意），并以元组返回
     */
    val result2 = sale match {
      case Bundle(_, _, art@Book(_, _), rest@_*) => (art, rest)
    }

    /**
     * (Book(漫画,40.0),WrappedArray(Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0)))))
     * art =Book(漫画,40.0)
     * rest=WrappedArray(Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0))))
     */
    println(result2)
    println("art =" + result2._1)
    println("rest=" + result2._2)

    println("---------------------------")
    /**
     * 知识点补充3：不使用_*绑定剩余Item到rest
     */
    val result3 = sale match {
      //说明因为没有使用 _* 即明确说明没有多个Bundle,所以返回的rest，就不是WrappedArray了。
      case Bundle(_, _, art @ Book(_, _), rest) => (art, rest)
    }

    /**
     * (Book(漫画,40.0),Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0))))
     * art =Book(漫画,40.0)
     * Bundle前面的WrappedArray拿掉了
     * rest=Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0)))
     */
    println(result3)
    println("art =" + result3._1)
    println("rest=" + result3._2)
  }
}

//设计的样例类
abstract class Item // 项

case class Book(description: String, price: Double) extends Item

//Bundle 捆 ， discount: Double 折扣 ， item: Item* ,可变参数
case class Bundle(description: String, discount: Double, item: Item*) extends Item
