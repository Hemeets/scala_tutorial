package chapter07

import scala.collection.mutable

object test07_mutableset {
  def main(args: Array[String]): Unit = {
    // 1 创建set
    val set1: mutable.Set[Int] = mutable.Set(13, 23, 53, 12, 13, 23, 78)
    println(set1)
    println("================")

    // 2 添加元素
    val set2 = set1 + 11
    println(set2)

    set1 += 11
    println(set1)
    set1.add(10)
    println(set1)
    println("===============")

    // 3 删除元素
    set1 -= 11
    println(set1)
    set1.remove(10)
    println(set1)

    // 4 合并set
    val set3 = mutable.Set(13, 23, 13, 27, 98, 29)
    println(set1)
    println(set3)

    val set4 = set1 ++ set3
    println(set1)
    println(set3)
    println(set4)
    println("==============")

    set1 ++= set3
    println(set1)

  }

}
