package chapter05

import scala.annotation.tailrec

object test10_recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))


    // 递归实际计算阶乘
    def fact(n: Int): Int = {
      if (n == 0) return 1   // 这个return 不可以省
      fact(n - 1) * n  // 这个return 可以省
    }

    // 尾递归实现（不会每次递归都入栈，而是只保存一个函数）
    def tailFact(n: Int): Int = {
      @tailrec  // 可以加这个保证是尾递归，否则会报错
      def loop(n: Int, currRes: Int): Int = {
        if (n == 0) return currRes
        loop(n - 1, currRes * n)
      }
      loop(n, 1)
    }


  }

}
