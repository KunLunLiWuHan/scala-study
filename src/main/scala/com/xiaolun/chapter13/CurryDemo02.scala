package com.xiaolun.chapter13

object CurryDemo02 {
  def main(args: Array[String]): Unit = {
    //方式2：使用稍微高级的用法(隐式类)：形式为 str.方法()
    //这是一个函数，可以接收两个字符串，比较是否相等
    def eq(s1: String, s2: String): Boolean = {
      s1.equals(s2)
    }

    /**
     * 1、体现了将比较字符串的事情，分解成两个任务完成
     * 2、checkEq 完成转换大小写
     * 3、f 完成比较任务
     * 4、运行str1.checkEq("HeLLO")(eq)时，
     * 参数 s 是 hello,ss是 HEllo。
     */
    implicit class TestEq(s: String) {
      def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
        f(s.toLowerCase, ss.toLowerCase)
      }
    }
    val str1 = "hello"
    println(str1.checkEq("HeLLO")(eq))

    //方式3：直接传入匿名函数方式
//    str1.checkEq("HELLO")((s1: String, s2: String) =>  s1.equals(s2))
//    str1.checkEq("HELLO")((s1, s2) =>  s1.equals(s2))
    str1.checkEq("HELLO")(_.equals(_)) //true
  }

  //方式1: 简单的方式,使用一个函数完成
  def eq2(s1: String)(s2: String): Boolean = {
    s1.toLowerCase == s2.toLowerCase
  }
}
