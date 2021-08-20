package chapter06

import org.omg.CORBA.PERSIST_STORE

object test07_inherit {
  def main(args: Array[String]): Unit = {
    val student1 = new Student7("alice", 20)
    println("================")
    val student2 = new Student7("bob", 20, "std001")



    student1.printInfo()
    student2.printInfo()

    def personInfo(person: Person7): Unit = {  // 动态绑定
      person.printInfo()
    }

    val person = new Person7
    personInfo(student1)
    personInfo(person)

  }
}


// 定义一个父类
class Person7() {
  var name: String = _
  var age: Int = _
  println("1. 父类的主构造器调用")

  def this(name: String, age: Int) {
    this()
    println("2. 父类的辅助构造器没调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"person: $name, $age")
  }

}

// 定义子类
class Student7(name: String, age: Int) extends Person7 {  // 相当于直接在这里调用父类主构造器
  var stdNo: String = _
  println("3. 子类的主构造器被调用")

  def this(name: String, age: Int, stdNo: String){
    this(name, age)
    println("4 子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"student: $name, $age, $stdNo")
  }
}