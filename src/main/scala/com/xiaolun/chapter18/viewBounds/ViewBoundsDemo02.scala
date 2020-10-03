package com.xiaolun.chapter18.viewBounds

object ViewBoundsDemo02 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("tom", 10)
    val p2 = new Person("jack", 20)
    val compareComm2 = new CompareComm2(p1, p2)
    println(compareComm2.getter)
  }
}

/**
 * 1、对象的比较
 * 2、Person继承Ordered
 */
class Person(val name: String, val age: Int) extends Ordered[Person] {
  //重写了Ordered的compare方法，进行对象的比较。（我的年龄比你大，返回大于0）
  override def compare(that: Person): Int = this.age - that.age

  //显示方便
  override def toString: String = this.name + "\t" + this.age
}

//使用视图界定的方式，比较两个Person对象的年龄大小。
/**
 * 1、
 */
class CompareComm2[T <% Ordered[T]](obj1: T, obj2: T) {
  //回去调用Person中的compare方法
  def getter = if (obj1 > obj2) obj1 else obj2

  def geatter2 = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
