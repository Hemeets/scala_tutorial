package chapter07

import scala.collection.mutable.ArrayBuffer

object test02_arraybuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变数组
    val arr1 = new ArrayBuffer[Int]()

    val arr2 = ArrayBuffer(23, 57, 92)
//    val arr3 = ArrayBuffer()
    println(arr1.mkString(","))
    println(arr2.mkString(","))
    println(arr2)  // 与不可变Array不同
    println(arr2.toString())
//    println(arr3.mkString(","))

    // 2. 访问元素
    println(arr2(0))
    arr2(1) = 39
    println(arr2(1))

    println("------------------------")
    // 3. 添加元素
    val newarr2 = arr1 += 19  // 后面加 += , 不推荐再赋给另一个值，即使他们引用同一个地址
    println(arr1)
    println(newarr2)
    println(arr1 == newarr2)
    newarr2 += 13
    println(arr1)

    77 +=: arr1  // 前面加 +=:
    println(arr1)

    // 可变数组推荐这种
    arr1.append(36)
    arr1.prepend(11, 76)
    println(arr1)
    arr1.insert(1, 13)
    arr1.insert(1, 33, 59)
    println(arr1)

    arr1.insertAll(2, newarr2)
    println(arr1)
    arr1.appendAll(newarr2)
    println(arr1)





  }

}
