package chapter06

object test15_traitoverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    student.increase()

    // 钻石问题特征叠加
    val myFootBall = new MyFootBall
    println(myFootBall.describe())
  }

}

// 定义球类特征
trait Ball {
  def describe(): String = "ball"
}
// 定义颜色特征
trait ColorBall extends Ball {
  var color: String = "red"
  override def describe(): String = color + "-" + super.describe()
}
// 定义种类特征
trait CategoryBall extends Ball {
  var category: String = "foot"
  override def describe(): String = category + "-" + super.describe()
}

class MyFootBall extends CategoryBall with ColorBall {  // super继承关系：myfootball--> colorball --> categoryball --> ball
//  override def describe(): String = "my ball is a " + super.describe()
  override def describe(): String = "my ball is a " + super[CategoryBall].describe()  // super可以指定调用哪个类

}

trait Knowledge15 {
  var amount: Int = 0
  def increase(): Unit = {
    println("knoewledge increased")
  }
}

trait Talent15 {
  def singing(): Unit
  def dancing(): Unit
  def increase(): Unit = {
    println("talent increased")
  }
}

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def dancing(): Unit = println("dancing")

  override def singing(): Unit = println("singing")

  override def increase(): Unit = {  // 多个trait有相同的方法，继承后必须重写
    super.increase()  // 从后往前，即先调用knowledge的increase
  }
}

/*
特质和抽象类的区别
1 优先使用特质，一个类拓展多个特质是很方便的，但却只能扩展一个抽象类。
2 如果需要构造函数参数，使用抽象类。因为抽象类可以定义带参数但构造函数，而特质不行（有无参构造）
 */