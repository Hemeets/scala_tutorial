package chapter08

object test06_partialfuction {
  def main(args: Array[String]): Unit = {

    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))

    // 1. map转换实现key不变，value2倍
    val newList = list.map( tuple => (tuple._1, tuple._2 * 2))
    println(newList)

    // 2. 用模式匹配对元组元素赋值，实现
    val newlist2 = list.map(
      tuple => {
        tuple match {
          case (word, count) => (word, count * 2)
        }
      }
    )
    println(newlist2)

    // 3. 2的简化，省略lambda表达式
    val newlist3 = list.map
      {
        case (word, count) => (word, count * 2)
      }
    println(newlist3)

    // 偏函数的应用，求绝对值
    // 对输入数据分为不同对情形：正、负、0
    val positiveabs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val negativeabs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }
    val zeroabs: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    def abs(x: Int): Int = (positiveabs orElse negativeabs orElse zeroabs) (x)
    println(abs(-67))
    println(abs(35))
    println(abs(0))




  }

}
