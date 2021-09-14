package chapter07

import scala.collection.mutable

object test16_mergemap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)

    println(map1 ++ map2)  // map2 会覆盖 map1

    val map3 = map1.foldLeft(map2)(  // 这里不用fold的原因是fold要求(A, B)=> A, AB类型一样，而fold底层是调用foldRight
      (mergemap, kv) => {
        val key = kv._1
        val value = kv._2
        mergemap(key) = mergemap.getOrElse(key, 0) + value
        mergemap
      }
    )
    println(map3)




  }

}
