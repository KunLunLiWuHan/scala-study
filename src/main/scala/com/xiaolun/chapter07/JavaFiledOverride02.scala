package com.xiaolun.chapter07

object JavaFiledOverride02 {
  def main(args: Array[String]): Unit = {
    val obj1: BB= new BB
    val obj2: AA= new BB

    /**
     * 1、输出：obj1.age=20	 obj2.age=20
     * 2、obj1.age=》 obj1.age()动态绑定机制
     *
     */
    println("obj1.age="+obj1.age+"\t obj2.age="+obj2.age)
  }
}

class AA {
  val age : Int = 10  //会生成public age()
}

class BB extends AA {
  override val age : Int = 20 //会生成public age()
}
