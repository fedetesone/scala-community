package classesandobjects.scala

class Counter {
  private var count: Int = 0

  def increment(): Unit = {
    count += 1
  }

  def getCount: Int = count
}


