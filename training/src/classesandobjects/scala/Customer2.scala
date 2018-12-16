package classesandobjects.scala

class Customer2(val name: String, val address: String) {
  var id: String = ""
}

object Customer2 {
  def main(args: Array[String]): Unit = {
    val bob = new Customer2("bob", "Alvear 1520")
    bob.id = "0001"
    bob.id_$eq("0001")
  }
}