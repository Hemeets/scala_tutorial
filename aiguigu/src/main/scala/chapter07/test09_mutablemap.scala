package chapter07

import scala.collection.mutable

object test09_mutablemap {
  def main(args: Array[String]): Unit = {
    // 1 创建map
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 13, "b" -> 25, "hello" -> 3)
    println(map1)
    println(map1.getClass)

    println("===========")

    // 2 添加/修改元素
    map1.put("c", 5)
    map1.put("d", 9)
    println(map1)
    map1.put("d", 11)
    println(map1)

    map1 += (("e", 7))  // 注意这里是两重小括号
    println(map1)
    println("==============")

    // 3 删除元素
    map1.remove("c")
    map1 -= "d"
    println(map1)
    println("==============")

    // 5 合并两个map
    val map2: Map[String, Int] = Map("aa" -> 13, "b" -> 29, "hello" -> 5)
//    map1 ++= map2  // map1 做调用，用2覆盖1
//    println(map1)
//    println(map2)

    val map3 = map2 ++ map1  // map2 做调用，用1覆盖2
    println(map1)
    println(map2)
    println(map3)



  }

}
