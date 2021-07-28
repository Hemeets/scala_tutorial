package chapter05

object test03_functionparameter {
  def main(args: Array[String]): Unit = {
    // 1 可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("alice")
    f1("aaa", "bbb", "ccc")

    // 如果参数列表中存在多个参数，那么可变参数一般放在最后
    def f2(str1: String, str2: String*): Unit = {
      println("str1: " + str1 + " str2: " + str2)
    }
    f2("alice")
    f2("aaa", "bbb", "ccc")

    // 3 参数默认值，一般放在参数列表后面，（前面也不会报错）
    def f3(name: String = "atguigu"): Unit = {
      println("my school is " + name)
    }
    f3("school")
    f3()


  }

}
