package chapter04

object test04_practice_pyramid {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9){
      val stars = 2 * i - 1
      val spaces = 9 - i
      println(" " * spaces + "*" * stars)
    }

    for (i <- 1 to 9; stars = 2 * i - 1; spaces = 9 - i){
      println(" " * spaces + "*" * stars)
    }


  }
}
