package chapter02

import chapter01.Student

object Test07_DataType {
    def main(args: Array[String]): Unit = {

        // 1. 整数类型
        val a1: Byte = 127
        val a2: Byte = -128

        val a3 = 12 // 整数默认类型位int
        //    val a4 = 1231231223213123   // 会报错
        val a4 = 1231231223213123L

        val b1: Byte = 10
        val b2: Byte = 10 + 20 // 其实没错
        println(b2)

        val b3: Byte = (b1 + 20).toByte
        println(b3)

        // 2. 浮点类型
        val f1: Float = 1.2344F
        val d1 = 323.23 // 默认是double

        // 3. 字符类型
        val c1: Char = 'a'
        println(c1)

        val c2: Char = '9'
        println(c2)

        val c3: Char = '\t'
        val c4: Char = '\n'
        println("abc" + c3 + "def")
        println("abc" + c4 + "def")

        val i1: Int = c1
        println("i1: " + i1)
        println(c1.toInt)
        val i2: Int = c2
        println("i2: " + i2)

        val c7: Char = (i1 + 1).toChar
        println(c7)
        val c8: Char = (i2 - 1).toChar
        println(c8)

        // 4. 布尔类型
        val isTrue: Boolean = true
        println(isTrue)

        // 5. 空类型
        // 5.1 空值Unit ()
        def m1(): Unit = {
            println("m1 被调用执行")
        }

        val a = m1() // val a: Unit = m1()
        println(a)

        // 5.2 空引用Null, 实例null
        //    val n: Int = null  // error
        var student = new Student("alice", 20)
        student = null // 引用类型，scala的类
        println(student)

        // 5.3  Nothing 抛出异常
        def m2(n: Int): Int = {
            if (n == 0)
                throw new NullPointerException // Nothing ，是Int类型的子类
            else
                return n
        }

        val b = m2(3)
        println(b)




    }

}
