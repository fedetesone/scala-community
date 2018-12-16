package classesandobjects.scala

class Customer (val name: String, val address: String){
}

object Customer {
  def main(args: Array[String]): Unit = {
    val bob = new Customer("bob", "Alvear 1520")
  }
}
