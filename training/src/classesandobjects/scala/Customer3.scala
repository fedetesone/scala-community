package classesandobjects.scala

class Customer3(private var _id: String, val name: String, val address: String, x: String) {
  def id: String = _id

  def id_=(value: String): Unit = {
    if (_id.isEmpty) {
      _id = value
    }
  }
}

object Customer3 {
  def main(args: Array[String]): Unit = {
    val bob = new Customer3("0001","bob", "Alvear 1520", "1")
    bob.id = "0001"
    bob.id_$eq("0001")
    bob.id_=("0001")
  }
}

