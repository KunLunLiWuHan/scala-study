package com.xiaolun.chapter02

object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    print(sayHello)
  }

  /**
   * 在开发中，有一个方法会异常中断，我们可以将其返回Nothing
   * 即使用Nothing做返回值，就是明确说明该方法没有正常返回值。
   */
  def sayHello: Nothing={
    throw new Exception("抛出异常")
  }
}
