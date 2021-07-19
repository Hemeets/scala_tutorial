package chapter01

import java.sql.Struct

class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
//    println(this.name + " " + this.age + " " + Student.school)  // 与上面的一样
  }
}

// 引入伴生对象
object Student{
  val school: String = "aiguigu"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 23)

    alice.printInfo()
    bob.printInfo()
  }
}