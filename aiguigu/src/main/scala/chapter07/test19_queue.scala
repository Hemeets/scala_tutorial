package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object test19_queue {
  def main(args: Array[String]): Unit = {

    val queue = new mutable.Queue[String]()
    // 创建可变队列

    queue.enqueue("a", "b", "c")
    println(queue)

    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    println(queue)

    val queue2 = Queue("a", "b", "c")
    val queue3 = queue2.enqueue("d")
    println(queue2)
    println(queue3)


  }

}
