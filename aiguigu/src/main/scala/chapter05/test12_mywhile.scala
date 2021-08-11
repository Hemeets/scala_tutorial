package chapter05

import java.util.concurrent.locks.Condition

object test12_mywhile {
  def main(args: Array[String]): Unit = {
    var n = 10

    // 1 常规都while循环
    while (n >= 1){
      println(n)
      n -= 1
    }

    // 2. 用闭包实现一个函数，将代码块作为参数传入，递归调用
    def mywhile(condition: =>Boolean): (=>Unit)=>Unit = {
      // 内层函数需要递归调用，参数就是循环体
      def doloop(op: =>Unit): Unit = {
        if (condition){
          op
          mywhile(condition)(op)
        }
      }
      doloop
    }

    n = 10
    mywhile(n >= 1)(
      {
        println(n)
        n -= 1
      }
    )
    println("=====================")

    // 3 用匿名函数实现化简
    def mywhile2(condition: =>Boolean): (=>Unit)=>Unit = {
      // 内层函数需要递归调用，参数就是循环体
      op => {
        if (condition){
          op
          mywhile2(condition)(op)
        }
      }
    }
    n = 10
    mywhile2(n >= 1)(
      {
        println(n)
        n -= 1
      }
    )

    println("=====================")
    // 4 用柯里化实现
    def mywhile3(condition: =>Boolean)(op: =>Unit): Unit = {
      if (condition){
        op
        mywhile3(condition)(op)
      }
    }
    n = 10
    mywhile3(n >= 1)(
      {
        println(n)
        n -= 1
      }
    )





  }

}
