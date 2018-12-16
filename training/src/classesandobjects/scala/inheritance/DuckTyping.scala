package classesandobjects.scala.inheritance

class Dog {
  def speak() {
    println("woof")
  }
}

class Klingon {
  def speak() {
    println("Qapla!")
  }
}

class WithBar {
  val bar: String = "I'm a bar!"
}

class WithoutBar {
  val foo: String = "I'm a foo!"
}

object DuckTyping extends App {
  def callSpeak[A <: {def speak() : Unit}](obj: A) {
    obj.speak()
  }

  def BarPrinter[B <: {val bar : String}](obj: B): Unit = {
    println(obj.bar)
  }

  val x = new AnyRef() {
    def speak() {
      println("I'm X")
    }
  }

  callSpeak(new Dog)
  callSpeak(new Klingon)
  callSpeak(x)

  BarPrinter(new WithBar)
  // BarPrinter(new WithoutBar)
}

