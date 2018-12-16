package classesandobjects.scala

class Customer4(forename: String, initial: String, surname: String) {
  val fullname: String = if (initial != null && !initial.isEmpty)
    s"$forename $initial. $surname"
  else
    s"$forename $surname"

  def this(forename: String, surname: String) {
    this(forename, "", surname)
  }

  def this(surname: String) {
    this("Mr.", surname)
  }
}

object Customer4 {
  def main(args: Array[String]): Unit = {
    val c1 = new Customer4("Homer", "J", "Simpson")
    val c2 = new Customer4("Homer", "Simpson")
    val c3 = new Customer4("Simpson")

    println(c1.fullname)
    println(c2.fullname)
    println(c3.fullname)
  }
}


