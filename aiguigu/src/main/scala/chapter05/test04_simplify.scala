package chapter05

object test04_simplify {
  def main(args: Array[String]): Unit = {
    // 函数至简原则

    // 1.  return 可以省略
    def f0(name: String): String = {
//      return name
      name
    }
    println(f0("atguigu"))
    println("======================")

    // 2. 如果函数只有一行代码，可以省略花括号
    def f2(name: String): String = name
    println(f2("atguigu"))
    println("======================")

    // 3. 返回值类型如果能够推断出来，那么可以省略（：和返回值类型一起省略）
    def f3(name: String) = name
    println(f3("atguigu"))
    println("======================")

    // 4. 如果return没有省略，那么返回值类型就不能省略

    // 5. 如果函数声明Unit，即使函数体中使用return也不起作用
    def f5(name: String): Unit = {
      return name
    }
    println(f5("aiguigu"))
    println("======================")

    // 6. scala如果期望是无返回值类型，可以省略等号
    def f6(name: String) {
      println(name)
    }
    println((f6("aiguigu")))
    println("======================")

    // 7. 如果函数无参，但是声明了参数列表，那么调用时，小括号可加可不加
    def f7(): Unit = {
      println("atguigu")
    }
    f7()
    f7
    println("======================")

    // 8. 如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8: Unit = {
      println("atguigu")
    }
//    f8()  // error
    f8
    println("======================")

    // 9. 如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
    def f9(name: String): Unit = {
      println(name)
    }

    // 匿名函数，lambda表达式
    (name: String) => {println(name)}



  }

}
