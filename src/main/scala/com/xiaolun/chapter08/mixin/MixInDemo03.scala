package com.xiaolun.chapter08.mixin

object MixInDemo03 {
  def main(args: Array[String]): Unit = {
    /**
     * 特质构造顺序
     * 1、声明类的同时混入特质（class FF extends EE with CC with DD）
     * (1)调用当前类的超类构造器 EE -》 E...
     * (2)第一个特质的父特质构造器  CC -> A.. (找到最终的父类，之后
     *                  倒过来执行) -> B..
     * (3)第一个特质构造器 -> c..
     * (4)第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行 -> D..
     * (5)第二个特质构造器
     * (6).......重复(4),(5)的步骤(如果有第3个，第4个特质)
     * (7)最后执行当前类构造器  -》F..
     */
//    val ff1 = new FF()
//    println(ff1)

    /**
     * 1、在构建对象时，动态混入特质（class KK extends EE）
     * 声明：先创建new kk对象，然后再混入其他特质
     * （1）调用当前类的超类构造器  -》E..
     * （2）当前类构造器 ->K.. (之后的顺序和第一种特质构造顺序一致
     *                   A...
     *                   B....
     *                   C....
     *                   D....)
     * （3）第一个特质构造器的父特质构造器
     * （4）第一个特质构造器.
     * （5）第二个特质构造器的父特质构造器, 如果已经执行过，就不再执行
     * （6）第二个特质构造器
     * （7）.......重复5,6的步骤(如果有第3个，第4个特质)
     * （8）当前类构造器
     */
    val ff2 = new KK() with CC with DD
    println(ff2)
  }
}

trait AA {
  println("A...")
}

trait BB extends AA {
  println("B....")
}

trait CC extends BB {
  println("C....")
}

trait DD extends BB {
  println("D....")
}

class EE {
  println("E...")
}

/**
 * 先继承EE,然后在继承CC和DD
 */
class FF extends EE with CC with DD {
  println("F....")
}

/**
 * KK继承普通类EE
 */
class KK extends EE {
  println("K....")
}