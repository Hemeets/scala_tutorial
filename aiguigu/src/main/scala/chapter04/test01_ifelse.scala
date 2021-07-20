package chapter04

import scala.io.StdIn

object test01_ifelse {
    def main(args: Array[String]): Unit = {
        println("please input your age: ")
        val age: Int = StdIn.readInt()


        if (age <= 6){
            println("child")
        } else if (age < 18){
            println("teen")
        } else if (age < 35){
            println("strong")
        } else {
            println("old")
        }

        // 分支语句的返回值
        val result: Unit = if (age <= 6){
            println("child")
        } else if (age < 18){
            println("teen")
        } else if (age < 35){
            println("strong")
        } else {
            println("old")
        }
        println(result)

        val result1: Any = if (age <= 6){  // Any是String和Int的公共父类
            println("child")
            "child"
        } else if (age < 18){
            println("teen")
            age
        } else if (age < 35){
            println("strong")
            age
        } else {
            println("old")
            age
        }
        println(result1)


        val res = if (age > 18) "成年" else "未成年"
        println(res)

    }
}
