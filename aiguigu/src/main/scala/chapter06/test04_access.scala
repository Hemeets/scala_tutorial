package chapter06

object test04_access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person: Person = new Person()
//    person.idCard  // error
//    person.name  // error
    println(person.age)
    println(person.sex)
    person.printInfo()

    val worker: Worker = new Worker()
    worker.printInfo()

  }

}


// 定义一个子类
class Worker extends Person {  // 继承
  override def printInfo(): Unit = {
    println("worker: ")
//    println(idCard)  // error
    name = "bob"
    age = 25
    sex = "male"
    println(s"worker: ${name}, ${sex}, ${age}")
  }
}