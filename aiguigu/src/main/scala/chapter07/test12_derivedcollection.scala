package chapter07

object test12_derivedcollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 3, 5, 7, 2, 89)
    val list2 = List(3, 7, 2, 45, 4, 8, 19)

    // 1 获取集合的头
    println(list1.head)

    // 2 获取集合的尾
    println(list1.tail)  // 不是最后一个元素，而是：不是头的都是尾

    // 3 获取最后一个元素
    println(list1.last)

    // 4 初始元素
    println(list1.init)  // 除了最后的一个元素，前面所有的数据

    // 5 翻转
    println(list1.reverse)

    // 6 取前/后n个元素
    println(list1.take(3))
    println(list1.takeRight(4))

    // 7 去掉前/后n个元素
    println(list1.drop(3))
    println(list1.dropRight(4))

    // 8 并集
    val union = list1.union(list2)
    println("union: " + union)
    println(list1 ::: list2)
    // 如果是set做并集，会做去重
    val set1 = Set(1, 3, 5, 7, 2, 89)
    val set2 = Set(3, 7, 2, 45, 4, 8, 19)
    val union2 = set1.union(set2)
    println("union2: " + union2)

    // 9 交集
    val intersection = list1.intersect(list2)
    println("intersection: " + intersection)

    // 10 差集
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println("diff1: " + diff1)
    println(s"diff2: ${diff2}")

    // 11 拉链
    println("zip: " + list1.zip(list2))
    println("zip2: " + list2.zip(list1))

    // 12 滑窗
    println(list1.sliding(3))
    list1.sliding(3).foreach(println)
    println("=============")
    for (elem <- list2.sliding(4, 2))
      println(elem)









  }

}
