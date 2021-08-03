package chapter05

object test07_practice_collectionoperator {
  def main(args: Array[String]): Unit = {
    // 对数组进行处理，将操作抽象出来，处理完毕后的结果返回一个新的数组

    def arrayOperation(array: Array[Int], op: Int=>Int): Array[Int] = {
      for (elem <- array) yield op(elem)
      }



    val arr: Array[Int] = Array(12, 35, 75, 98)

    // 定义一个加一操作
    def addOne(elem: Int): Int = {
      elem + 1
    }

    val newArray: Array[Int] = arrayOperation(arr, addOne)
    println(newArray.mkString(","))  // 不能直接打印数组

    val newArray2 = arrayOperation(arr, elem => elem * 2)
    println(newArray2.mkString(", "))


  }

}
