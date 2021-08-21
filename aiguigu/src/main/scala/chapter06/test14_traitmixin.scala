package chapter06

object test14_traitmixin {
  def main(args: Array[String]): Unit = {
    val student = new Student14
    student.study()
    student.increase()
    student.play()
    student.increase()
    student.dating()
    student.increase()


    // 动态混入（类似匿名子类）
    val student_with_talent = new Student14 with Talent {
      override def dancing(): Unit = println("student is good at dancing")

      override def singing(): Unit = println("student is good at singing")
    }

    student_with_talent.sayhello()
    student_with_talent.play()
    student_with_talent.study()
    student_with_talent.increase()
    student_with_talent.singing()
    student_with_talent.dancing()

  }
}

// 再定义一个特质
trait Knowledge {
  var amount: Int = 0
  def increase(): Unit
}

trait Talent {
  def singing(): Unit
  def dancing(): Unit
}


class Student14 extends Person13 with Young with Knowledge {
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

  // 实现特质中的抽象方法
  override def increase(): Unit = {
    amount += 1
    println(s"student $name knowledge increased: $amount")
  }

}