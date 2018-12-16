package classesandobjects.scala

class CustomerCompanion private (val name: String, val address: String) {
  private val id: Int = CustomerCompanion.nextId()
}

object CustomerCompanion {
  def apply(name: String, address: String): CustomerCompanion = new CustomerCompanion(name, address)

  private var sequenceOfIds: Int = 0

  private def nextId(): Int = {
    sequenceOfIds += 1
    sequenceOfIds
  }

  def main(args: Array[String]): Unit = {
    val c1: CustomerCompanion = CustomerCompanion.apply("Marty McFly", "9303 Lyon Drive")
    val c2: CustomerCompanion = CustomerCompanion("Emmett Brown", "1640 Riverside Drive")
  }
}

