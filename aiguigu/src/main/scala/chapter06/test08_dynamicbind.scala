package chapter06

object test08_dynamicbind {
  def main(args: Array[String]): Unit = {
    val student: Person8 = new Student8
    println(student.name)
    student.hello()
  }

}


class Person8 {
  val name: String = "person"
  def hello(): Unit = {
    println("hello person")
  }
}

class Student8 extends Person8 {
  override val name: String = "student"  // 需要加 override 关键字
  override def hello(): Unit = {
    println("hello student")
  }
}