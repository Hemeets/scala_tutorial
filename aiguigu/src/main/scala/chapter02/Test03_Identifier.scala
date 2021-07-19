package chapter02

object Test03_Identifier {
  def main(args: Array[String]): Unit = {
    val hello: String = ""
    var Hello123 = ""
    val _abc = 123

//    val h-b = ""
//    val 123abc = 234

    val -+/% = "hello"  // 操作符可可以作为变量
    println(-+/%)

//    val if 报错
    val `if` = "if"  // 用反引号 可以定义变量
    println(`if`)

  }

}
