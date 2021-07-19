package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    // （1）字符串，通过+连接
    val name: String = "alice"
    val age: Int = 18
    println(age + "岁的" + name + "在尚硅谷学习")

    // * 用于将一个字符串复制多次拼接（乘法）
    println(name * 3)

    // printf用法：字符串，通过%传值
    printf("%d岁的%s 在尚硅谷学习\n", age, name)

    // 字符串模版（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在尚硅谷学习")  // s"" 表示模版字符串

    val num: Double = 2.3456
    val num1: Float = 2.3456f
    println(s"The num is ${num}")  // num 有多少小数位都输出
    println(f"The num is ${num}%2.2f")  // 格式化模版字符串
    println(raw"The num is ${num}%2.2f")

    // 三引号表示字符串，保持多行字符串都源格式输出
    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin  //stripMargin 当然就是忽略边界了

    println(sql)


  }

}
