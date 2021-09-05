package chapter07

object test03_mularray {
  def main(args: Array[String]): Unit = {
    // 1. 创建二维数组
    val array: Array[Array[Int]] = Array.ofDim[Int](2, 3)

    // 2. 访问元素
    val a1 = array(0)(2)
    println(a1)
    array(0)(2) = 19
    array(1)(0) = 25
    println(array.mkString(","))
    for (i <- 0 until array.length; j <- 0 until array(i).length) {
      println(array(i)(j))
    }
    for (i <- array.indices; j <- array(i).indices) {
      print(array(i)(j) + "\t")
      if (j == array(i).length - 1){
        println()
      }
    }
    array.foreach(line => line.foreach(println))
    array.foreach(_.foreach(println))

    array.foreach(line => println(line.mkString(", ")))


  }

}
