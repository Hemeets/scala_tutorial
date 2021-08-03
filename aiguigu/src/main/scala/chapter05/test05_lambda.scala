package chapter05

object test05_lambda {
  def main(args: Array[String]): Unit = {
    val fun = (name: String) => { println(name) }  // 把lambda函数符给变量
    fun("atguigu")

    // 定义一个函数，以函数作为参数输入
    def f(func: String => Unit): Unit = {
      func("atguiguu")
    }
    f(fun)

    // 匿名函数的简化原则
    // 1. 参数的类型可以省略
    f((name) => { println(name)} )

    // 2. 类型省略后，如果只有一个参数，可以省略圆括号，否则不可以省略
    f(name => { println(name)})

    // 3. 如果匿名函数体只有一行，{}可以省略
    f(a => println(a))

    // 4. 如果参数只出现一次，则参数省略且后面参数可以用_代替
    f( println(_))

    // 5. 如果可以推断出，当前传入的println是一个函数体，而不是调用语句，可以直接省略下划线
    f( println )

    // 示例，定义一个二元运算，只操作1和2两个数，但是具体运算通过参数传入
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    // 匿名函数简化
    println(dualFunctionOneAndTwo((a, b) => a + b))
    println(dualFunctionOneAndTwo((a, b) => a - b))

    println(dualFunctionOneAndTwo(_ + _))
    println(dualFunctionOneAndTwo(_ - _))




  }

}
