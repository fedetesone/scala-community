package classesandobjects.scala

object Logger {
  def log(level: String, string: String): Unit = {
    printf("%s %s%n", level, string)
  }

  def main(args: Array[String]): Unit = {
    Logger.log("INFO", "March, no voy a mentirte")
  }
}

