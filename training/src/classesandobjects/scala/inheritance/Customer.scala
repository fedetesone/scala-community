package classesandobjects.scala.inheritance

class Customer(val name: String, val address: String) {
  private final val basket: Seq[String] = Seq()

  def add(item: String): Unit = {
    basket :+ item
  }

  def count: Double = {
    basket.size
  }
}

class DiscountedCustomer(name: String, address: String) extends Customer(name, address) {
  override def count: Double = super.count * 0.80
}

