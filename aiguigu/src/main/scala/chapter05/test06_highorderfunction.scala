package chapter05

object test06_highorderfunction {
  def main(args: Array[String]): Unit = {

    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    val result: Int = f(123)
    println(result)

    // 1 函数可以作为值进行传递
    val f1: Int=>Int = f
    val f2 = f _ // 如果不加类型，就需要f _
    println(f1)
    println(f1(12))
    println(f2)
    println(f2(35))

    // 2 函数作为参数进行传递
    // 定义 二元计算函数
    def dualEval(op: (Int, Int)=>Int, a: Int, b: Int): Int = {
      op(a, b)
    }
    def add(a: Int, b: Int): Int = {
      a + b
    }

    val res = dualEval(add, 12, 35)
    println(res)
    println(dualEval((a, b) => a + b, 12, 35))
    println(dualEval(_ + _, 12, 35))

    // 3. 函数作为函数的返回值返回
    def f5(): Int=>Unit = {
      def f6(a: Int): Unit = {
        println("f6调用" + a)
      }
//      f6 _
      f6
    }
    println(f5())
    println(f5()(25))


  }

}
