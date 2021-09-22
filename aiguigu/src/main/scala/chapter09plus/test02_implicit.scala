package chapter09plus

object test02_implicit {
  def main(args: Array[String]): Unit = {

    val new12 = new MyRichInt(12)
    println(new12.mymax(15))

    // 1. 隐式函数
//    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)

//    println(12.mymax(15))  // 会自动寻找作用域内隐式函数

    // 2. 隐式类(scala 2.10)
    implicit class MyRichInt2(val self: Int) {
      // 自定义比较大小方法
      def mymax2(n: Int): Int = if (n < self) self else n
      def mymin2(n: Int): Int = if (n < self) n else self
    }

    println(12.mymin2(15))
    println("====================")

    // 3. 隐式参数

    implicit val str: String = "alice"
    implicit val num: Int = 18
    def sayhello(implicit name: String): Unit = {  // 不是找相同名称"name"，而是找相同类型String，所以同一作用域内，隐式参数只能有一个
      println("hello, " + name)
    }
    def sayhi(implicit name: String = "aiguigu"): Unit = {
      println("hi, " + name)
    }
    sayhello
    sayhi  // 隐式值优先级大于默认值
    println("============")

    // 简便写法
    def hiage(): Unit = {
      println("hi, " + implicitly[Int])  // 表示想要拿到一个Int类型的隐式参数
    }
    hiage()




  }

}

// 自定义类
class MyRichInt(val self: Int) {
  // 自定义比较大小方法
  def mymax(n: Int): Int = if (n < self) self else n
  def mymin(n: Int): Int = if (n < self) n else self
}
