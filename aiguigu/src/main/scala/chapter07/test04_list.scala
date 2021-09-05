package chapter07

object test04_list {
  def main(args: Array[String]): Unit = {
    // 1 创建一个list  ,list 没有索引，只在意头尾
    val list1 = List(23, 65, 87)
    println(list1)

    // 2 访问和遍历
    println(list1(1))
//    list(1) = 12  // error，不能赋值
    list1.foreach(println)

    // 3 添加元素
    val list2 = list1 :+ 10
    val list3 = 23 +: list1
    println(list1)
    println(list2)
    println(list3)

    val list4 = list2.::(51)
    println(list4)
    val list5 = Nil.::(13)
    println(list5)

    val list6 = 73 :: 32 :: Nil
    val list7 = 17 :: 28 :: 59 :: 16 :: Nil
    println(list6)
    println(list7)

    // 合并列表
    val list8 = list6 :: list7
    println(list8)

    val list9 = list6 ::: list7
    println(list9)

    val list10 = list6 ++ list7  // 与 ::: 等价
    println(list10)


  }

}
