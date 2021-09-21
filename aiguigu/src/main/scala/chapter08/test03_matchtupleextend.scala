package chapter08

object test03_matchtupleextend {
  def main(args: Array[String]): Unit = {
    // 1. 在声明变量时匹配
    val (x, y) = (10, "hello")
    println(s"x: $x, y: $y")

    val List(first, second, _*) = List(23, 15, 9, 78)
    println(s"first: ${first}, second: $second")
    val fir :: sec :: rest = List(23, 15, 9, 78)
    println(s"first: ${fir}, second: $sec, rest: $rest")

    // 2. for推导式中进行模式匹配
    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))
    // 2.1 原本都遍历方式
    for (elem <- list) {
      println(elem._1 + " " + elem._2)
    }
    // 2.2 将List的元素直接定义为元组
    for ((word, count) <- list) {
      println(word + ": " + count)
    }

    // 2.3 只遍历key或value
    for ((word, _) <- list)
      println(word)

    // 2.4 可以指定某个位置的值必须是多少
    for (("a", count) <- list) {
      println(count)
    }


  }

}
