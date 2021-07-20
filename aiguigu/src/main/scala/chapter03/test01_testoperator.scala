package chapter03

object test01_testoperator {
    def main(args: Array[String]): Unit = {
        val result3: Double = 10.0 / 3
        println(result3.formatted("%.2f"))

        // 比较运算符
        val s1: String = "hello"
        val s2: String = new String("hello")  // java 中的写法
        println(s1 == s2)  // 与java 中不一样，java中这里是判断内存地址，会返回false; scala 中则是true
        println(s1.equals(s2))

        def m(n: Int): Int = {
            println("m被调用")
            return n
        }

        val n = 1
        println((4 > 5) && m(n) > 0 ) // 一个& 是按位与;

        def isNotEmpty(str: String): Boolean = {
            return str != null && !("".equals(str.trim))  // trim 去掉空格
        }

        println(isNotEmpty(str = null))

        // 赋值运算符
        var b: Byte = 10
//        b += 1  // 这里与java不同，java这样是可以的，scala不可以，当然 int就没问题了
//        println(b)
        var i: Int = 11
        i += 1
        println(i)

        // 位运算符
        val a = 60
        println(a << 3)

        // 运算符的本质
        val n1: Int = 12
        val n2: Int = 37
        println(n1.+(n2))
        println(n1 + n2)

        println(7.5 toString)
    }

}
