package chapter06

object test11_object {
  def main(args: Array[String]): Unit = {
//    val student = new Student11("alice", 18)
//    student.printInfo()

    val student1 = Student11.newstudent("bob", 19)
    student1.printInfo()

    val student2 = Student11.apply("asdfa", 2)
    student2.printInfo()

    val student3 = Student11("fasdfasdf", 2323)
    student3.printInfo()

  }

}


// 定义类
class Student11 private (val name: String, val age: Int){
  // private 私有类就不能直接调用了，可以在伴生对象中定义调用
  def printInfo(): Unit ={
    println(name + age + s"${Student11.school}")
  }
}

// 伴生对象，【可以访问当前伴生类的私有成员】
object Student11{
  val school: String = "atguigu"  // 相当于静态对象

  def newstudent(name: String, age: Int): Student11 = new Student11(name, age)

  // apply函数名具有特殊性，如果定义了，在调用时可以省略'apply'函数名
  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}