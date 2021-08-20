package chapter06

object test13_trait {
  def main(args: Array[String]): Unit = {
    val student: Student13 = new Student13
    student.sayhello()
    student.study()
    student.dating()
    student.play()
  }

}

/*
特质 trait
 */

// 定于一个父类
class Person13 {
  val name: String = "person"
  var age: Int = 18
  def sayhello(): Unit = {
    println("hello from " + name)
  }
}

// 定义一个特质trait，整体和抽象类很相似
trait Young {
  // 可以声明抽象和非抽象属性
  var age: Int
  val name: String = "young"
  // 声明抽象和非抽象方法
  def play(): Unit = {
    println("young people is playing")
  }
  def dating(): Unit
}

class Student13 extends Person13 with Young {
  // 重写冲突
  override val name: String = "student"
//  override var age: Int = 200

  // 实现抽象方法
  override def dating(): Unit = println(s"student $name is dating")

  def study(): Unit = println(s"student $name is studying")

  // 重写父类方法
  override def sayhello(): Unit = {
    super.sayhello()
    println(s"heello from: " + name)
  }

}