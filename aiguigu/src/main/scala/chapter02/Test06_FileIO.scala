package chapter02

import java.io.{PrintWriter, File}
import scala.io.Source

object Test06_FileIO {
    def main(args: Array[String]): Unit = {

        // 从文件读取
        Source.fromFile("src/main/resources/test.txt").foreach(print)

        // 将数据写入文件
        val writer = new PrintWriter(new File("src/main/resources/output.txt"))
        writer.write("hello scala from java writer")
        writer.close()

    }

}
