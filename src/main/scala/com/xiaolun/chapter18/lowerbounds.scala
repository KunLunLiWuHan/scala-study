package com.xiaolun.chapter18

object lowerbounds {
  def main(args: Array[String]): Unit = {
    /**
     * hello !
     * hello !
     * 传入和Animal直系的，是Animal父类的还是父类处理。
     */
    biophony(Seq(new Earth, new Earth)).map(_.sound())
    biophony(Seq(new Animal, new Animal)).map(_.sound())

    /**
     * bird sounds
     * bird sounds
     * 1、虽说Bird是Animal的子类，但是不会报错。
     * 不能使用上界的思路来类推下界的含义
     * Animal子类的按照Animal处理(子类覆盖率父类的方法，所以是bird sounds
     * 当将子类覆盖方法给注释时，输出animal sounds)。
     * 也就是下界，可以随便传，只是处理是方式不一样
     */
    biophony(Seq(new Bird, new Bird)).map(_.sound())

    /**
     * 1、不会报错，和Animal无关的，一律按照Object处理
     */
    biophony(Seq(new Moon))
  }

  /**
   * 上界案例返回：things map (_.sound)
   * 1、返回的是things，因为不能保证父类是否有方法sound()
   */
  def biophony[T >: Animal](things: Seq[T]) = things

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

class Moon {}
