package classesandobjects.scala

class Box[T](var field: T) {

}

object Box {
  val b1 = new Box(1)
  val b2 = new Box("hola")
  val b3 = new Box[Int](1)
  val b4: Box[String] = new Box("Hola"): Box[String] // Coercion
  val b5: Box[Int] = new Box(1)

  println(b1.field) // Int value.
}

