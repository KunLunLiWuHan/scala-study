package com.xiaolun.chapter05.myException

object ThrowDemo01 {
  def main(args: Array[String]): Unit = {
    //情况1：不处理异常
//    val res = test()
//    println(res.toString)
//
//    //异常还没处理时，下面代码不会执行
//    println("-----ok------")

    //情况2：如果我们希望test()抛出异常后，代码可以继续执行，我们需要对其进行处理
    try{
      test()
    }catch {
      case ex:Exception => println("捕获到了异常："+ex.getMessage)
    }
    println("-----ok------")
  }

  //自定义的异常
  def test(): Nothing = {
    throw new Exception("------异常出现-----")
  }
}
