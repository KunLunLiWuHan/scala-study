package com.xiaolun.chapter05

object DetailParameter01 {
  def main(args: Array[String]): Unit = {
    //    mysqlCon()

    //从左向右覆盖参数
    //    mysqlCon("127.0.0.1",7777)

    //指定覆盖某个默认值，使用带名参数即可。
    mysqlCon(user = "xiaolun", pwd = "123")
  }

  def mysqlCon(add: String = "localhost", port: Int = 3306,
               user: String = "root", pwd: String = "root"): Unit = {
    println("add=" + add)
    println("port=" + port)
    println("user=" + user)
    println("pwd=" + pwd)
  }

  //错误，递归不能使用类型推断，必须指定返回的数据类型
  def f8(n: Int): Int = {
    if (n <= 0)
      1
    else
      n*f8(n - 1)
  }
  def test(): Unit ={

  }
}
