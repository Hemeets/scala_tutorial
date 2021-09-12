package chapter07

object test06_immutable_set {
  def main(args: Array[String]): Unit = {
    // 1 创建set
    val set1 = Set(12, 23, 53, 12, 13, 23, 78)
    println(set1)
    println("===============")

    // 2 添加元素 set的可变/不可变长的一样，默认是不可变，可变需要声明
    val set2 = set1 + 20
    println(set1)
    println(set2)
    println("================")

    // 3 合并set
    val set3 = Set(12, 23, 53, 67, 99)
//    val set4 = set2 + set3  //error
    val set4 = set2 ++ set3
    println(set4)

    // 4 删除元素
    val set5 = set3 - 12
    println(set5)



  }

}
