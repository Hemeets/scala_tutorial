package chapter08

object test05_matchcaseclass {
  def main(args: Array[String]): Unit = {
    val student = Student1("alice", 18)

    // 针对对象实例对内容进行匹配
    val result = student match {
      case Student1("alice", 18) => "alice, 18"
      case _ => "else"
    }

    println(result)

  }

}

// 定义样例类
case class Student1(name: String, age: Int)  // 样例类，参数默认为属性，自动创建伴生对象apply，unapply方法
