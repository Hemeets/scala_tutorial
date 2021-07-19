package chapter02

import scala.reflect.internal.Flags

object Test08_DataTypeConversion {
    def main(array: Array[String]): Unit = {

        // 1. 自动提升原则
        val a1: Byte = 10
        val b1: Long = 2353
        val result1: Long = a1 + b1
        val result11: Int = (a1 + b1).toInt

        // 2. 精度大大数值类型赋值给精度小大数值类型时，就会报错，反之就会进行自动转换
        val a2: Byte = 10
        val b2: Int = a2
//        val c2: Byte = b2 // error

        // 3. （byte，short）和 char 之间不会相会自动转换
        val a3: Byte = 10
        val b3: Char = 'b'
//        val c3: Byte = b3  // error
        val c3: Int = b3
        println(c3)

        // 4. byte，short，char 三者可以计算，首先转换为Int类型
        val a4: Byte = 12
        val b4: Short = a4
        val c4: Char = 'c'
        val result4: Int = a4 + b4
        val result44: Int = a4 + b4 + c4
        println(result44)

        // 强制类型转换
        val n1: Int = 2.5.toInt  // 不做近似，只是整数部分
        println(s"n1: ${n1}")
        val n2: Int = (2.6+ 3.7).toInt
        println(s"n2: $n2")

        // 数值类型和string 类型的转换
        // 数值to string
        val n: Int = 27
        val s: String = n + ""
        println(s)
        val s1: String = n.toString
        println(s"s1: $s1")

        // string to 数值
        val m: Int = "12".toInt
        val f: Float = "12.3".toFloat
        val f2: Int = "12.3".toFloat.toInt
        println(f2)



    }

}
