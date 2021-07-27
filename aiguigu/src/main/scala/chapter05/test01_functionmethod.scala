package chapter05

object test01_functionmethod {
  def main(args: Array[String]): Unit = {
    // define function
    def sayhi(name: String): Unit = {
      println("hi, " + name)
    }

    // 调用函数
    sayhi("alice")

    // 调用对象方法
    test01_functionmethod.sayhi("bob")

    // 获取方法返回值
    val res = test01_functionmethod.sayhello("cary")
    println(res)

  }

  // method
  def sayhi(name: String): Unit = {
    println("hhi, " + name)
  }
  def sayhello(name: String): String = {
    println("hello, " + name)
    return "hello"
  }
}
