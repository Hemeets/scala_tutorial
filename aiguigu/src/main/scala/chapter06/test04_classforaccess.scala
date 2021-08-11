package chapter06

object test04_classforaccess {

}

// 定义一个父类
class Person {
  private var idCard: String = "23452345"
  protected var name: String = "alice"
  var sex: String = "female"
  private[chapter06] var age: Int = 18  // 包内可以访问

  def printInfo(): Unit = {
    println(s"person: ${idCard}, ${name}, ${sex}, ${age}")
  }
}