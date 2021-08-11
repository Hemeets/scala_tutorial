package chapter06

import scala.beans.BeanProperty

object test03_class {
  def main(args: Array[String]): Unit = {
    val student = new Student()
//    student.name   // error, 不能访问private属性
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)

  }

}


// 定义一个类
class Student {
  // 定义属性
  private var name: String = "alice"  // 可以用java中的private
  @BeanProperty
  var age: Int = _  // _ 对应 0
//  val sex: String = "male"
  var sex: String = _  // _ 表示初值为空 null
}