package com.xiaolun.chapter18.contextbounds

object contextboundsDemo01 {
  //定义了一个隐式值 Ordering[Person]类型
  implicit val personComparetor = new Ordering[Person] {
    override def compare(p1: Person, p2: Person): Int =
      p1.age - p2.age
  }

  def main(args: Array[String]): Unit = {
    val p1 = new Person("mary", 30)
    val p2 = new Person("smith", 35)

    val compareComm4 = new CompareComm4(p1, p2)
    println(compareComm4.geatter) //smith 35

    val compareComm5 = new CompareComm5(p1, p2)
    println(compareComm5.geatter) //smith	35

    val compareComm6 = new CompareComm6(p1, p2)
    println(compareComm6.geatter) //smith	35
  }
}

//方式1
//implicit comparetor: Ordering[T] 隐式参数
class CompareComm4[T: Ordering](obj1: T, obj2: T)(implicit comparetor: Ordering[T]) {
  def geatter = if (comparetor.compare(obj1, obj2) > 0) obj1 else obj2
}

//方式2,将隐式参数放到方法内
class CompareComm5[T: Ordering](o1: T, o2: T) {
  def geatter = {
    //返回一个数字 p1.age - p2.age
    def f1(implicit cmptor: Ordering[T]) = cmptor.compare(o1, o2)
    if (f1 > 0) o1 else o2
  }
}

//方式3,使用implicitly语法糖，最简单(推荐使用)
class CompareComm6[T: Ordering](o1: T, o2: T) {
  def geatter = {
    //这句话就是会发生隐式转换，获取到隐式值 personComparetor
    val comparetor = implicitly[Ordering[T]]
    println("CompareComm6 comparetor：" + comparetor.hashCode())
    if (comparetor.compare(o1, o2) > 0) o1 else o2
  }
}

//一个普通的Person类
class Person(val name: String, val age: Int) {
  override def toString = this.name + "\t" + this.age
}
