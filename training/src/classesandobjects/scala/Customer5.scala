package classesandobjects.scala

class Customer5(forename: String = "Mr.", initial: String = "", surname: String) {
  val fullname: String = if (initial != null && !initial.isEmpty)
    s"$forename $initial. $surname"
  else
    s"$forename $surname"
}

object Customer5 {
  def main(args: Array[String]): Unit = {
    val c1 = new Customer5("Homer", "J", "Simpson")
    val c2 = new Customer5("Homer", surname = "Simpson")
    val c3 = new Customer5(surname = "Simpson")

    println(c1.fullname)
    println(c2.fullname)
    println(c3.fullname)
  }
}



