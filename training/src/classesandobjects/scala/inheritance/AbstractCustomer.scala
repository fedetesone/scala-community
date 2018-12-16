package classesandobjects.scala.inheritance

abstract class AbstractCustomer {
  def total: Double
}

class Customer extends AbstractCustomer {
  def total: Double = 10
}

