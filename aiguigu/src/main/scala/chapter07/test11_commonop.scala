package chapter07

object test11_commonop {
  def main(args: Array[String]): Unit = {

    val list = List(1,3,5,7,2,89)
    val set = Set(23, 24, 423, 75)

    // 1 获取集合长度
    println(list.length)  // set没有.length

    // 2 获取集合大小
    println(list.size)
    println(set.size)

    println("===============")
    // 3 循环遍历
    for (elem <- list)
      println(elem)

    set.foreach(println)

    println("================")
    // 4 迭代器
    for (elem <- list.iterator)
      println(elem)

    // 5 生成字符串
    println(list)
    println(set)
    println(list.mkString("-"))

    println("================")
    // 6 是否包含
    println(list.contains(23))
    println(set.contains(23))


  }

}
