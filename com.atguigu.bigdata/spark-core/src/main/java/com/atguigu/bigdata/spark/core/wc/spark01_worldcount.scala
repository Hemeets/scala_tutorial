package com.atguigu.bigdata.spark.core.wc

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object spark01_worldcount {
  def main(args: Array[String]): Unit = {

    // Application

    // Spark框架

    // TODO 建立和spark框架的连接

    val sparkConf = new SparkConf().setMaster("local").setAppName("wordcount")
    val sc = new SparkContext(sparkConf)

    // TODO 执行业务操作

    // 1. 读取文件，获取一行一行的数据  hello world
    val lines: RDD[String] = sc.textFile("data")

    // 2  将一行数据进行拆分
    val words: RDD[String] = lines.flatMap(_.split(" "))

    // 3  将数据根据单词进行分组，便于统计
    val wordGroup: RDD[(String, Iterable[String])] = words.groupBy(word => word)

    // 4  对分组后的数据进行转换
    val wordToCount = wordGroup.map {
      case (word, list) => {
        (word, list.size)
      }
    }

    // 5  将转换结果采集到控制台打印出来
    val array: Array[(String, Int)] = wordToCount.collect()
    array.foreach(println)

    // TODO 关闭连接

    sc.stop()



  }

}
