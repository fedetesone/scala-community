package classesandobjects.scala.inheritance

trait Counter {
  // Default value.
  var count = 0

  def increment()
}

class IncrementByOne extends Counter {
  override def increment(): Unit = count += 1
}

object IncrementByOne {
  def main(args: Array[String]): Unit = {
    val inc = new IncrementByOne()

    inc.count = 1
    inc.increment()
    println(inc.count)
    inc.increment()
    println(inc.count)
  }
}
