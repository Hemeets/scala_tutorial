package chapter04

object test03_practice_multable {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9){
      for (j <- 1 to i){
        print(s"$j * $i = ${i * j} \t")
      }
      println()
    }
  }

}
