package chapter02

/*
130: Int, 4字节，32位
原码：0000 0000 0000 0000 1000 0010
补码：0000 0000 0000 0000 1000 0010

截取最后一个字节Byte
得到补码 1000 0010
对应原码 1111 1101 + 1 = 1111 1110  后7位为126
-126

*/

object Test09_Problem_DataTypeConversion {
    def main(args: Array[String]): Unit = {

        val n: Int = 130
        val b: Byte = n.toByte  // -128~127
        println(s"b: $b")
    }

}
