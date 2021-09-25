package chapter09plus

object test03_generics {
  def main(args: Array[String]): Unit = {
    // 1. 协变和逆变
    val child: Parent = new Child
    val childList: Mycoolection[Parent] = new Mycoolection[Child] // 为了使这个成立，需要+E

   // 2. 上下限
    def test[A <: Child](a: A): Unit = {
     println(a.getClass.getName)
    }
    test[Child](new Child)
//    test[Parent](new Child)  // error


  }
}

// 定义继承关系
class Parent {}
class Child extends Parent{}
class subChild extends Child{}

// 定义带泛型带集合类型
class Mycoolection[+E] {}

//