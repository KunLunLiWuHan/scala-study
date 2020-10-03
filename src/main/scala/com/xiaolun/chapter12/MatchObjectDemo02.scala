package com.xiaolun.chapter12

object MatchObjectDemo02 {
  def main(args: Array[String]): Unit = {
    val namesString = "Alice,Bob,Thomas"

    /**
     * 当执行 case Names(first, second, third)时
     * 1、会调用unapplySeq(str: String)，并把"Alice,Bob,Thomas"
     * 传入 str
     * 2、如果返回的时some("Alice","Bob","Thomas"),分别给(first, second, third)
     * 注意，此时返回值的个数和Names中的参数格式要保持一致，否则匹配失败
     * 3、返回none表示匹配失败
     */
    namesString match {
      case Names(first, second, third) => {
        println("the string contains three people's names")
        // 打印字符串
        println(s"$first $second $third")
      }
      case _ => println("nothing matched")
    }
  }

  object Names {
    /**
     * 1、当构造器是多个参数时，就会触发unapply对象提取器
     */
    def unapplySeq(str: String): Option[Seq[String]] = {
      if (str.contains(",")) Some(str.split(","))
      else None
    }
  }

}
