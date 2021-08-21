package chapter06

import com.sun.jdi.ShortType

object test17_extends {
  def main(args: Array[String]): Unit = {
    // 1 类型的检测和转换
    val student: Student17 = new Student17("alice", 18)
    student.study()
    student.sayhi()
    val person: Person17 = new Student17("bob", 20)
    person.sayhi()
//    person.study()  // error

    // 类型判断
    println("student is student17: " + student.isInstanceOf[Student17])
    println("student is Person17 " + student.isInstanceOf[Person17])
    println("person is Person17 " + person.isInstanceOf[Person17])
    println("person is student " + person.isInstanceOf[Student17])

    val person2: Person17 = new Person17("cary", 35)
    println("person2 is Student: " + person2.isInstanceOf[Student17])

    // 类型转换
    if (person.isInstanceOf[Student17]) {
      val newStudent = person.asInstanceOf[Student17]
      // 如果不做类型转换，那么现有的person即使定义时用的student类，也不能使用study方法
      newStudent.study()

    }

    println(classOf[Student17])

    // 2 测试枚举类
    println(Workday.MON)
  }

}

class Person17(val name: String, val age: Int) {
  def sayhi(): Unit = {
    println("hi from person " + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age) {
  override def sayhi(): Unit = {
    println("hi from student " + name)
  }
  def study(): Unit = {
    println("student study")
  }
}

// 定义枚举类对象
object Workday extends Enumeration {
  val MON = Value(1, "monday")
  val Tues = Value(2, "tuesday")
}

// 定义应用类对象，App类里面包含main方法，可以直接运行
object TestApp extends App {
  println("app start")

  type Mystring = String  // 自定义类别
  val a: Mystring = "abc"
  println(a)
}