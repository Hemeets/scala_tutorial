package chapter07

import scala.collection.mutable.ListBuffer

object test05_listbuffer {
  def main(args: Array[String]): Unit = {
    // 1 创建可变列表
    val list1 : ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(12, 53, 75)

    println(list1)
    println(list2)

    println("================")

    // 2 添加元素
    list1.append(15, 62)
    list2.prepend(20)

    list1.insert(1, 19, 22)

    println(list1)
    println(list2)

    list1 += 25 += 11
    31 +=: 96 +=: list1
    println(list1)

    println("=================")
    // 3 合并列表
    val list3 = list1 ++ list2
    println(list1)
    println(list2)
    println(list3)

    println("================")
    list1 ++=: list2
    println(list1)
    println(list2)

    println("============")
    // 4 修改元素
    list2(3) = 30
    println(list2)
    list2.update(0, 89)
    println(list2)

    println("===========")
    // 5 删除元素
    list2.remove(2)  // 按索引删
    println(list2)
    list2 -= 25  // 按值删
    println(list2)




  }

}
