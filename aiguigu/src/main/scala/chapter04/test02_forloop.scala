package chapter04

object test02_forloop {
  def main(args: Array[String]): Unit = {

    // 1 索引
    // 包括后面边界
    for (i <- 0 to 9){
      println(s"$i hello world")
    }
    for (i <- 1.to(10)){
      println(f"$i%.2f hello world")
    }

    // 不包含后面边界10
    for (i <- Range(1, 10)) {
      println(i + ". hello world")
    }
    for (i <- 1 until 10) {
      println((i + ". hello"))
    }

    // 2 集合遍历
    for (i <- Array(12, 34, 53)) {
      println(i)
    }
    for (i <- List(12, 34, 53)) {
      println(i)
    }
    for (i <- Set(12, 34, 53)) {
      println(i)
    }

    // 3 循环守卫
    for (i <- 1 to 10){
      if (i != 5){
        println(i)
      }
    } // 等价于
    for (i <- 1 to 10 if i!= 5){
      println(i)
    }

    println("=====================")
    // 4. 循环步长
    for (i <- 1 to 10 by 2){
      println(i)
    }
    for (i <- 10 to 1 by -2){  // 倒叙遍历，负步长
      println(i)
    }

    for (i <- 1 to 10 by 2 reverse){  //
      println(i)
    }

    for (data <- 1.0 to 10.0 by 0.3){  // step 是小数, to可能精度缺失，推荐用BigDecimal
      println(data)
    }

    println("=====================")

    // 5 循环嵌套
    for (i <- 1 to 3){
      for (j <- 1 to 3){
        println(s"i=$i, j=$j")
      }
    }

    for (i <- 1 to 3; j <-1 to 5){  // 可以写在一起，更简介
      println(s"i=$i, j=$j")
    }

    // 6循环引入变量
    for (i <- 1 to 10; j = 10 - i){
      println("i = " + i + ", j = " + j)
    }


  }

}
