package chapter07

object test14_highlevelfuction_map {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 1 过滤
    // 选取偶数
    val evenlist = list.filter((elem: Int) => {
      elem % 2 == 0
    })
    println(evenlist)
    println(list.filter(_ % 2 == 0)) // 化简
    println("=======================")

    // 2 map
    // 把集合中每个数乘2
    println(list.map(_ * 2))
    println(list.map(x => x * x))
    println("=======================")

    // 3 扁平化
    val nestedlist: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8))
    val flatlist = nestedlist(0) ::: nestedlist(1) ::: nestedlist(2)
    println(flatlist)
    val flatlist2 = nestedlist.flatten
    println(flatlist2)
    println("===================")

    // 4 扁平映射
    // 将一组字符串进行分词，并保存成单词的列表
    val strings: List[String] = List("hello world", "hello scala", "hello java", "we study")
    val splitlist: List[Array[String]] = strings.map(_.split(" "))
    val flattenlist = splitlist.flatten
    println(flattenlist)
    val flatmpalist = strings.flatMap(_.split(" "))
    println(flatmpalist)
    println("==================")

    // 5 分组操作groupBy
    // 分成奇偶两组
    val groupmap: Map[Int, List[Int]] = list.groupBy(_ % 2)
    val groupmap2: Map[String, List[Int]] = list.groupBy(data => {
      if (data % 2 == 0) "偶数" else "奇数"
    })
    println(groupmap)
    println(groupmap2)

    // 给定一组词汇，按照分词的首字母进行分组
    val wordlist = List("china", "america", "alice", "canada", "cary", "bob")
    println(wordlist.groupBy(_.charAt(0)))

  }

}
