package classesandobjects.scala

object Tests {
  def main(args: Array[String]): Unit = {
    val bob = new Customer2("bob", "Alvear 1520")
    bob.id = "0001"
    bob.id_$eq("0001")
    bob.id_=("0001")
  }
}
