package chapter07

object test01_immutablearray {
  def main(args: Array[String]): Unit = {
    // 1. 创建数组
    val arr: Array[Int] = new Array[Int](5)

    // 另一种创建的方式
    val arr2 = Array(12, 37, 42, 58, 97)

    // 2. 访问元素
    println(arr(0))
    println(arr(4))

    arr(0) = 12
    arr(4) = 57
    println(arr(0))
    println(arr(4))
    println("================")
    // 3. 数组遍历
    // 1) 普通for训话
    for (i <- 0 until arr.length) {
      println(arr(i))
    }
    for (i <- arr.indices) println(arr(i))

    // 2) 直接遍历元素，增强for循环
    for (elem <- arr2) {println(elem)}

    println("================")

    // 3) 迭代器
    val iter = arr2.iterator
    while (iter.hasNext){
      println(iter.next())
    }

    // 4) foreach 方法
    arr2.foreach( (elem: Int) => println(elem))

    arr.foreach( println )

    println(arr2.mkString("-"))  // 数组的打印 mkString

    println("================================")
    // 4. 添加元素
    val newarr = arr2.:+(73)  // :+ 加到末尾
    println(newarr.mkString("-"))

    val newarr2 = newarr.+:(30)  // +: 加到前面
    println(newarr2.mkString("-"))

    val newarr3 = newarr2 :+ 15  // 简化
    val newarr4 = 19 +: 29 +: newarr3 :+ 26 :+ 73
    println(newarr4.mkString("-"))





  }

}
