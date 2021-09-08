package chapter07

object test10_tuple {
  def main(args: Array[String]): Unit = {
    // 1 创建元组
    val tuple1: (String, Int, String, Boolean) = ("hello", 100, "a", true)
    println(tuple1)

    // 2 访问数据
    println(tuple1._1)  // 下划线从1开始
    println(tuple1._4)

    println(tuple1.productElement(1))  // 从0开始
    println("=============")

    // 3 遍历元组数据
    for (elem <- tuple1.productIterator)
      println(elem)
    println("==========")

    // 4 嵌套元组
    val multuple = (12, 0.3, "hello", (23, "scala"), 29)
    println(multuple._4._2)

  }

}
