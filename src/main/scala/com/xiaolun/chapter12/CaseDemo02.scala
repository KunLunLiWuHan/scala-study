package com.xiaolun.chapter12

object CaseDemo02 {
  def main(args: Array[String]): Unit = {
    val amt = Currency(29.95, "RMB")

    /**
     * 1、创建了一个新的对象，但是属性值一样
     * 2、类似于克隆
     * 3、copy()没有传参数的原因是因为Currency已经
     * 有参数了
     */
    val amt1 = amt.copy()
    //创建了一个新对象，但是修改了value
    val amt2 = amt.copy(value = 19.95)
    val amt3 = amt.copy(unit = "英镑")

    /**
     * Currency(29.95,RMB)
     * Currency(19.95,RMB)
     * Currency(29.95,英镑)
     */
    println(amt)
    println(amt2)
    println(amt3)
  }
}
