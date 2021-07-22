package chapter04

object test05_whileloop {
  def main(args: Array[String]): Unit = {

    var a: Int = 10
    while (a >= 1){
      println("this is a while loop: " + a)
      a -= 1
    }

    var b: Int = 0
    do {
      println("this is a do-while loop: " + b)
      b -= 1
    } while (b > 0)


  }

}
