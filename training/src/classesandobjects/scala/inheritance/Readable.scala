package classesandobjects.scala.inheritance

import java.io.File
import java.nio.CharBuffer

trait Readable {
  def read(buffer: CharBuffer): Int
}

class FileReader(file: File) extends Readable with AutoCloseable {
  override def read(buffer: CharBuffer): Int = {
    val linesRead: Int = 0
    linesRead
  }

  override def close(): Unit = ???
}

