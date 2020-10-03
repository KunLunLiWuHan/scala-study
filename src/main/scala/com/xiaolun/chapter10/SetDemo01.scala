package com.xiaolun.chapter10

import scala.collection.mutable

object SetDemo01 {
  def main(args: Array[String]): Unit = {
    //不可变集合的创建，不需要引入包
    val set = Set(1, 2, 3) //不可变
    //Set(1, 2, 3)
    println(set)

    ////可变集合的创建，需要引入包
    import scala.collection.mutable.Set
    val mutableSet = Set(1, 2, 3)
    //Set(1, 2, 3)
    println(mutableSet)

    /**
     * 可变集合元素的添加
     * 如果添加的对象已经存在，则不会重复添加，
     * 也不会报错
     */
    mutableSet.add(4) //方式1
    //Set(1, 2, 3, 4)
    println(mutableSet)

    mutableSet += 6  //方式2
    //Set(1, 2, 6, 3, 4)
    println(mutableSet)

    mutableSet.+=(5) //方式3
    //Set(1, 5, 2, 6, 3, 4)
    println(mutableSet)

    /**
     * 可变集合的元素删除
     *如果删除的对象不存在，则不生效，也不会报错
     */
      println("---------删除--------")
    val set02 = mutable.Set(1,2,4,"abc")
    // 方式1：操作符形式
    set02 -= 2
    // 方式2：scala的Set可以直接删除值
    set02.remove("abc")
    //Set(1, 4)
    println(set02)

    println("---------遍历--------")
    val set03 = mutable.Set(1, 2, 4, "abc")
    for(x <- set03) {
      println(x)
    }

  }
}
