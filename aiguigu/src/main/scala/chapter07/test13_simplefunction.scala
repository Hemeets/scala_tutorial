package chapter07

object test13_simplefunction {
  def main(args: Array[String]): Unit = {
    val list = List(5, 1, 8, 2, -3, 4)
    val list2 = List(("a", 5), ("b", 1), ("c", 8), ("d", 2), ("e", -3), ("f", 4))
    // 1 求和
    var sum = 0
    for (elem <- list){
      sum += elem
    }
    println(sum)

    println(list.sum)

    // 2 求乘积
    println(list.product)

    println("=============")
    // 3 4 最大/小值
    println(list.max)
    println(list2.max)
    println(list2.maxBy(tuple => tuple._2))
    println(list2.maxBy(_._2))  // 简化

    println(list.min)
    println(list2.minBy(_._2))

    // 5 排序
    // 5.1 sorted
    println("==============")
    val sortedlist = list.sorted  // 默认从小到大
    println(sortedlist)
    val slist2 = list.sorted(Ordering[Int].reverse)  // 从大到小
    println(slist2)

    // 5.2 sortby
    println(list2.sorted)
    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))

    // 5.3 sortwith  这个好！
    println("================")
    println(list.sortWith( (a: Int, b: Int) => {a < b}))  // 小到大
    println(list.sortWith( _ < _))  // 简化
    println(list.sortWith( _ > _))









  }

}
