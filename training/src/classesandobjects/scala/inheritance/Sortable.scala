package classesandobjects.scala.inheritance

import scala.collection.mutable

trait Sortable[T <: Ordered[T]] extends Iterable[T] {
  def sort: Seq[T] = this.toList.sorted
}

case class CustomerComparable(name: String) extends Ordered[CustomerComparable] {
  override def compare(c: CustomerComparable): Int = name.compare(c.name)

  override def toString: String = name
}

class Customers extends Sortable[CustomerComparable] {
  private val customers = mutable.Set[CustomerComparable]()

  def add(customer: CustomerComparable): Boolean = customers.add(customer)

  // Because we're also extending Iterable.
  override def iterator: Iterator[CustomerComparable] = customers.iterator
}

object CustomersTest {
  def main(args: Array[String]): Unit = {
    val customers = new Customers()
    customers.add(CustomerComparable("Fede"))
    customers.add(CustomerComparable("Walter"))
    customers.add(CustomerComparable("Vane"))
    customers.add(CustomerComparable("Franco"))
    customers.add(CustomerComparable("Hector"))

    println(customers.sort)
  }
}