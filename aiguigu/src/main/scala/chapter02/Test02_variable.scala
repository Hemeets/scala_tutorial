package chapter02

import chapter01.Student

import java.sql.Struct

object Test02_variable {
    def main(args: Array[String]): Unit = {
        var a: Int = 10 // 声明一个变量的普通语法

        var a1 = 10 // 声明变量时，类型可以省略，编译器自动推导，即类型推导
        val b1 = 23

        var a2 = 15 // a2类型为Int
        // a2 = "hello" 会报错，说明还是强类型语言，但是弱表示

        // 声明/定义一个变量时，可用var或val来修饰，var修饰的变量可改变，val不可改变
        a1 = 12
        //    b1 = 25 会报错

        var alice = new Student(name = "alice", age = 20)
        alice = new Student(name = "Alice", age = 20)
        alice = null
        val bob = new Student("bob", 23)
        bob.age = 24 // 在类定义时，变量前面应该加上var
        bob.printInfo()

    }

}
