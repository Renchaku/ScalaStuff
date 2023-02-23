import scala.io.StdIn.readChar

object CharSeq1 {
  def main(args: Array[String]): Unit = {
    println("Start character? ")
    var start: Char = readChar()
    
    println("end character? ")
    var end: Char = readChar()
    
    while (start <= end) {
      print(start + " ")
      start = (start + 1).toChar
    }
  }
}