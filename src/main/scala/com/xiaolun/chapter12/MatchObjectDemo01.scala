package com.xiaolun.chapter12

object MatchObjectDemo01 {
  def main(args: Array[String]): Unit = {

    // 模式匹配使用：
    val number: Double = 36.0
    number match {
      /**
       * case Square(n)是运行的机制
       * 1、当匹配到case Square(n)
       * 2、会调用Square的 unapply(z: Double) 方法
       * z的值就是number的值unapply(z: Double)
       * 3、如果对象提取器返回的是some(6),
       * 则表示匹配成功，同时将some(6)中的6放到Square(n)中的n中。
       */
      case Square(n) => println("匹配成功："+n)
      case _ => println("nothing matched")
    }
  }

  object Square {
    /**
     * 1、unapply方法为对象提取器
     * 2、接收z: Double类型
     * 3、返回一个Option[Double]集合
     * 4、Some(math.sqrt(z))将传入的z进行开平方，并放入到Some(x)
     */
    def unapply(z: Double): Option[Double] = {
      println("unapply被调用 z = "+ z)
      Some(math.sqrt(z))
    }

    def apply(z: Double): Double = z * z
  }
}
