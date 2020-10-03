package com.xiaolun.chapter13

object AbstractControl {
  def main(args: Array[String]): Unit = {
    //    myRunInThread {
    //      () =>
    //        //下面三个行为等价于放到f1()函数中去执行
    //        println("干活咯！5秒完成...")
    //        Thread.sleep(5000)
    //        println("干完咯！")
    //    }
    /**
     * 对于没有输入也没有返回值的函数，可以简写成这样的形式
     */
    myRunInThread2 {
      // 去掉() =>，当成一个代码块去执行
      println("干活咯！5秒完成...")
      Thread.sleep(5000)
      println("干完咯！")
    }
  }

  /**
   * 1、myRunInThread是一个抽象控制
   * 2、f1: () => Unit 没有输入，也灭有输出
   */
  //  def myRunInThread(f1: () => Unit) = {
  //    new Thread {
  //      override def run(): Unit = {
  //        f1()
  //      }
  //    }.start()
  //  }
  
  def myRunInThread2(f1: => Unit) = {
    new Thread {
      override def run(): Unit = {
        f1 //简化处理，省略()以便执行代码块
      }
    }.start()
  }
}
