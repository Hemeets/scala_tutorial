package chapter05

object test09_closureandcurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1 考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b // 固定4
    }

    // 2 将固定加数作为另一个参数传入，但是是作为第一层参数传入
    def addByFour1(): Int=>Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    def addByA(a: Int): Int=>Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    println(addByA(35)(24))

    val addByFour2 = addByA(4)
    val addByFive = addByA(5)

    println(addByFour2(13))
    println(addByFive(25))


    def addByA1(a: Int): Int=>Int = {
      (b: Int) => {
        a + b
      }
    }

    def addByA2(a: Int): Int=>Int = {
      b => a + b
    }

    def addByA3(a: Int): Int=>Int = a + _

    // 5 柯里化, 底层一定是闭包
    def addcurrying(a: Int)(b: Int): Int = {
      a + b
    }
    println(addcurrying(35)(24))

  }

}
