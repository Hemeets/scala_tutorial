package chapter04

//import scala.util.control.Breaks
import scala.util.control.Breaks._


object test06_break {
  def main(args: Array[String]): Unit = {
    try {
      for (i <- 0 until 5){
        if (i == 3)
          throw new RuntimeException
        println(i)
      }
    } catch {
      case e: Exception => // 什么都不做，只是退出循环
    }

    // 2. 使用scala中的Break类的break方法，实现异常的抛出和捕捉
    breakable(
      for (i <- 0 until 5) {
        if (i == 3)
          break()
        println(i)
      }
    )
    println("这是循环外的代码")





  }
}
