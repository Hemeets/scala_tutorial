package chapter06

import javax.jnlp.PersistenceService

object test09_abstractclass {
  def main(args: Array[String]): Unit = {
    val student = new Student9
    student.eat()
    student.sleep()
  }

}


// 定义抽象类
abstract class Person9 {  // abstract 关键字
  // 非抽象属性
  val name: String = "person"

  // 抽象属性
  var age: Int

  // 非抽象方法
  def eat(): Unit = {
    println("person eat")
  }

  // 抽象方法
  def sleep(): Unit
}


// 定义具体的实现子类
class Student9 extends Person9 {
  var age = 18

  override def sleep(): Unit = {   // 父类是抽象类，重写抽象属性和方法可以不加override
    println("student sleep")
  }

  // 重写非抽象属性和方法
  override val name: String = "student"

  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }
}