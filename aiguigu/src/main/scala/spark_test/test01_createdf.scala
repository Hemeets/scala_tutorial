package spark_test

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{DataFrame, SparkSession}


object test01_createdf {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("test").setMaster("local")
//    val sc = new SparkContext(conf)

    val spark = SparkSession
      .builder()
      .config(conf)
      .getOrCreate()
    import spark.implicits._

//    val rdd = spark.sparkContext.parallelize(List(1,2,3,4,5))
//    val df = rdd.map(x => (x, x^2)).toDF("org", "xor")
//    df.show()

    val df_1 = Seq(
      ("user1", "word1", "trigger1", "src1", "feature1", 100),
      ("user2", "word2", "trigger2", "src2", "feature2", 200),
      ("user3", "word3", "trigger3", "src3", "feature3", 30),
      ("user4", "word4", "trigger4", "src4", "feature4", 400)
    ).toDF("user", "word", "trigger", "src", "feature", "qv")
    df_1.show()

    val df_ctr = Seq(
      ("word1", 10, 20, 0.5),
      ("word2", 100, 300, 0.33),
      ("word5", 10, 20, 0.5)
    ).toDF("word", "clk_num", "srch_num", "rate")
    df_ctr.show()

    val df_2 = df_1.join(df_ctr, Seq("word"), "left")
      .filter("rate is null or rate > 0.4")
    df_2.show()


  }

}
