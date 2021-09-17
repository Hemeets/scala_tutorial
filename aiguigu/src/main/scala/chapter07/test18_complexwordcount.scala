package chapter07

object test18_complexwordcount {
  def main(args: Array[String]): Unit = {

    val tupleList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello world", 2),
      ("hello scala", 3),
      ("hello spark from scala", 1),
      ("hello flink from scala", 2)
    )

    // 思路一：直接展开为普通版本
    val newStringList: List[String] = tupleList.map(
      kv => (kv._1.trim + " ") * kv._2
    )
    println(newStringList)
    // 接下来与普通版本完全一致
    val wordcountList: List[(String, Int)] = newStringList.flatMap(_.split(" "))
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.length))
      .toList
      .sortWith(_._2 > _._2)
    println(wordcountList)
    println("==============================")

    // 思路二：直接基于预统计结果进行转换
    // 1 将字符串打散为单词，并结合为二元组
    val precountlist: List[(String, Int)] = tupleList.flatMap(
      tuple => {
        val strings: Array[String] = tuple._1.split(" ")
        strings.map(word => (word, tuple._2))
      }
    )
    println(precountlist)
    // 2 对二元组 按照单词进行分组
    val precountmap: Map[String, List[(String, Int)]] = precountlist.groupBy(tuple => tuple._1)
    println(precountmap)

    val countMap: Map[String, Int] = precountmap.mapValues(
      tuplelist => tuplelist.map(_._2).sum
    )
    println(countMap)
//    val countMap: Map[String, Int] = precountmap.map(
//      wordmap => {
//        val curcnt: Int = wordmap._2.map(_._2).sum
//        (wordmap._1, curcnt)
//      }
//    )
//    println(countMap)

    val wordcountList2: List[(String, Int)] = countMap.toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(wordcountList2)


  }

}
