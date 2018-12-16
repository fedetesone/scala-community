package classesandobjects.scala

class FakeCaseClass(x: String, y: String) {

}

object FakeCaseClass {
  def apply(x: String, y: String): FakeCaseClass = new FakeCaseClass(x, y)
}

