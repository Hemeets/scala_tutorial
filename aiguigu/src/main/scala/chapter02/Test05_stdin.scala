package chapter02

import scala.io.StdIn

object Test05_stdin {
  def main(args: Array[String]): Unit = {

    println("please input your name: ")
    val name:String = StdIn.readLine()
    println("please input your age: ")
    val age: Int = StdIn.readInt()

    println(s"welcome ${age} ${name} ")

  }

}
