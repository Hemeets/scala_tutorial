package chapter06

object test10_annoymousclass {
  def main(args: Array[String]): Unit = {
    val person: Person10 = new Person10 {  // 匿名子类，直接实现，不用额外定义子类了
      override var name: String = "alice"

      override def eat(): Unit = println("person eat")
    }

    println(person.name)
    person.eat()
  }

}


// 定义抽象类
abstract class Person10 {
  var name: String
  def eat(): Unit
}