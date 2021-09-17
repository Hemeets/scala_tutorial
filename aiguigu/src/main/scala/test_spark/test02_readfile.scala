package test_spark

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{DataFrame, SparkSession}

object test02_readfile {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("test").setMaster("local")

    val spark = SparkSession
      .builder()
      .config(conf)
      .getOrCreate()
    import spark.implicits._

//    case class PROFILE(user: String, word: String, trigger: String, src: String, feature: String, qv: Int)
//    val p1 = PROFILE("user1", "", "trigger1", "src1", "feature1", 100)
//    val p2 = PROFILE("user2", "word2", "trigger2", "src2", "feature2", 200)
//    val p3 = PROFILE("user3", "word3", "trigger3", "src3", "feature3", 30)
//    val p4 = PROFILE("user4", "word4", "trigger4", "src4", "feature4", 400)
//    val df_1 = spark.sparkContext.parallelize(Seq(p1, p2, p3, p4)).toDF

    val df_1 = Seq(
      ("user1", "乔家的儿女", "trigger1", "src1", "feature1", 100),
      ("user2", "扫黑风暴", "trigger2", "src2", "feature2", 200),
      ("user3", "斗破苍穹 第1季", "trigger3", "src3", "feature3", 30),
      ("user4", "张艺兴", "trigger4", "src4", "feature4", 400),
      ("user5", "fake_word1", "trigger5", "src4", "feature4", 40),
      ("user5", "fake_word2", "trigger5", "src4", "feature4", 50),
      ("user1", "fake_word3", "trigger5", "src4", "feature4", 60)

    ).toDF("user", "word", "trigger", "src", "feature", "qv")
    df_1.show()

    val df_ctr = spark.read
      .option("sep", "\t")
      .option("header", "true")
      .csv("/Users/qdx/project/tutorial/scala_tutorial/aiguigu/src/main/resources/20210914")
      .withColumnRenamed("query_txt", "word")
      .withColumnRenamed("in_qid_cnt_total_7", "in_qid_cnt")
      .withColumnRenamed("in_clck_sess_cnt_total_7", "in_clck_cnt")
      .withColumnRenamed("rate_7", "ctr_session")
      .select("word", "in_qid_cnt", "in_clck_cnt", "ctr_session")
    println("query stat df: ")
    df_ctr.show(10)

//    val where_sql =
//      """
//        |ctr_session is null
//        |or not (ctr_session < 0.5
//        |and in_qid_cnt > 2000)
//        |""".stripMargin

    val where_sql =
      """
        |qv != 200 and qv != 100
        |""".stripMargin

    val df_2 = df_1.join(df_ctr, Seq("word"), "left")
    df_2.show()

    val df_3 = df_1
      .join(df_ctr, Seq("word"), "left")
      .filter(where_sql)
      .select(df_1.col("*"))
    df_3.show()


  }

}
