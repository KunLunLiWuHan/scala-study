package com.xiaolun.chapter16.wordcount

object WordCountsDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 需求
     * val lines = List("hello xiaolun tom","xiaolun hello hello")
     * 使用映射集合，统计各个单词出现的次数，并按照出现次数排序（从小到大排）
     */
    val lines = List("hello xiaolun tom", "xiaolun hello hello")
    /**
     * 步骤：先分步，再组合
     * 1、步骤1：
     * res1执行过后的结果：
     * List(hello, xiaolun, tom, xiaolun, hello, hello)
     */
    //    val res1 = lines.flatMap((s:String) => s.split(""))
    val res1 = lines.flatMap(_.split(" "))
    println("res1 = " + res1)

    /**
     * 步骤2：做成一个对偶list,才能够分组并统计
     */
    println("------------------------------------------")
    //    res1.map((s:String) => (s,1))
    var res2 = res1.map((_, 1))
    //List((hello,1), (xiaolun,1), (tom,1), (xiaolun,1), (hello,1), (hello,1))
    println(res2)

    /**
     * 步骤3：分组，把不同的单词，归属到不同的组
     * 对遍历出来的对偶元素，按照其第一个元素进行分组
     */
    println("------------------------------------------")
    //    var res3 = res2.groupBy((x:(String,Int)) => x._1)
    var res3 = res2.groupBy(_._1)
    //Map(tom -> List((tom,1)), xiaolun -> List((xiaolun,1), (xiaolun,1)), hello -> List((hello,1), (hello,1), (hello,1)))
    println("res3 =" + res3)

    /**
     * 步骤4：对上面的元组进行统计大小
     */
    println("------------------------------------------")
    //    var res4 = res3.map((x:(String,List[(String,Int)])) => (x._1,x._2.size))
    var res4 = res3.map(x => (x._1, x._2.size))
    //res4 =Map(tom -> 1, xiaolun -> 2, hello -> 3)
    println("res4 =" + res4)

    /**
     * 步骤5：排序
     * ((x: (String, Int)) => x._2)按照第二个元素排序
     */
    println("------------------------------------------")
    //    val res5 = res4.toList.sortBy((x: (String, Int)) => x._2)
    val res5 = res4.toList.sortBy(x => x._2) //从小到大
//    val res5 = res4.toList.sortBy(_.x._2) //和上面等价
    //    val res5 = res4.toList.sortBy(_.x._2).reverse //从大到小
    //res5 =List((tom,1), (xiaolun,2), (hello,3))
    println("res5 =" + res5)

  }
}
