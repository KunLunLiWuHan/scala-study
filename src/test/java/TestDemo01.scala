import scala.collection.mutable

object TestDemo01 {
  def main(args: Array[String]): Unit = {
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    val map2 = Map( ("A", 1), ("B", 2), ("C", 3),("D", 30) )
    val map3 = mutable.Map( ("A", 1), ("B", 2), ("C", 3),("D", 30) )
    println(map1("Alice"))
    println(map2("A"))
    map3("AA") = 1
    println("-----------------------------------")
    for (elem <- map3) {
      println(elem)
    }
    println("-----------------------------------")
    map3 -= ("A","B")
    for (elem <- map3) {
      println(elem)
    }
  }
}
