package com.xiaolun.chapter18.upperbounds

object UpperBoundsDemo02 {
  def main(args: Array[String]): Unit = {
    /**
     * bird sounds
     * bird sounds
     */
    biophony(Seq(new Bird, new Bird))
    println("--------------------------------")

    /**
     * animal sound
     * animal sound
     */
    biophony(Seq(new Animal, new Animal))
    println("--------------------------------")

    /**
     * animal sound
     * bird sounds
     */
    biophony(Seq(new Animal, new Bird)) //?
    println("--------------------------------")
    // 报错
    //    biophony(Seq(new Earth, new Earth))
  }

  /**
   * 1、定义了一个泛型
   * 2、_ 表示从things集合中取出的一个个元素
   */
  def biophony[T <: Animal](things: Seq[T]) = things map (_.sound)
}

class Earth { //Earth 类
  def sound() { //方法
    println("hello !")
  }
}

class Animal extends Earth {
  override def sound() = { //重写了Earth的方法sound()
    println("animal sound")
  }
}

class Bird extends Animal {
  override def sound() = { //将Animal的方法重写
    println("bird sounds")
  }
}
