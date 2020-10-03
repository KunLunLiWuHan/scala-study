package com.xiaolun.chapter07

object FiledOverrideDetail01 {
  def main(args: Array[String]): Unit = {
    val b = new BBBB
    /**
     *  b.name = "jack" 相当于调用了父类的name_$eq()
     *  println(b.name) 相当于调用了子类的name()
     *  这样的会会出现数据设置和数据获取不一致的问题
     */
    println(b.name)
  }
}

class AAAA {
  //将类型变成val的话，可以正常运行
  val name: String = ""
//  var name: String = ""  //底层会生成public name()和 public name_$eq()
}
class BBBB extends AAAA {
  override  val name: String = "jj" //底层会生成public name()
}
