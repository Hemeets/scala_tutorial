package object chapter06 {
  // 定义当前包共享都属性和方法
  val commonValue = "尚硅谷"
  def commonMethod(): Unit = {
    println(s"我们在${commonValue}学习")
  }
}
