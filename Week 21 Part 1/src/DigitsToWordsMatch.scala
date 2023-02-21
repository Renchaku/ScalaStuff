import scala.io.StdIn.readChar

object DigitsToWordsMatch {
  def main(args: Array[String]): Unit = {
    println("Type in a DIGIT ")
    var digit: Char = readChar()
    
    digit match {
      case '0' => println("ZERO")
      case '1' => println("ONE")
      case '2' => println("TWO")
      case '3' => println("THREE")
      case '4' => println("FOUR")
      case '5' => println("FIVE")
      case '6' => println("SIX")
      case '7' => println("SEVEN")
      case '8' => println("EIGHT")
      case '9' => println("NINE")
      case _ => println("NOT A DIGIT!")
    }
  }
}