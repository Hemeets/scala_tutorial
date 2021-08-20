package chapter06

/*
单例模式
 */

object test12_singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    student1.printInfo()

    val student2 = Student12.getInstance()
    student2.printInfo()

    // 查看引用是否一致
    println(student1)
    println(student2)
  }

}


// 定义类
class Student12 private (val name: String, val age: Int){
  // private 私有类就不能直接调用了，可以在伴生对象中定义调用
  def printInfo(): Unit ={
    println(name + age + s"${Student11.school}")
  }
}

// '饿汉式'
//object Student12 {
//  private val student: Student12 = new Student12("alice", 18)
//  def getInstance(): Student12 = student
//}

// '懒汉式'
object Student12 {
  private var student: Student12 = _
  def getInstance(): Student12 = {
    if (student == null){
      student = new Student12("alice", 18)
    }
    student
  }
}
