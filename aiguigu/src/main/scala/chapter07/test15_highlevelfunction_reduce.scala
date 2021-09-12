package chapter07

object test15_highlevelfunction_reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    // 1 reduce
    //    list.reduce( (a, b) => a + b)
    println(list.reduce(_ + _))
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))
    println("==================")

    val list2 = List(3, 4, 5, 8, 10)
    println(list2.reduce(_ - _))  // -24，底层默认就是reduceleft
    println(list2.reduceLeft(_ - _))  // -24
    println(list2.reduceRight(_ - _))  // 注意这里，并不是倒过来计算，而是：3 - (4 - (5 - (8 -10))) = 6




  }

}
