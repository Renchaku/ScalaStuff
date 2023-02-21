import scala.io.StdIn.readChar

object DigitToWOrdsMatch2 {
  def main(args: Array[String]): Unit = {
    println("Type in a digit ")
    var digit: Char = readChar()
    
    var result = digit match {
      case '0' => "ZERO"
      case '1' => "ONE"
      case '2' => "TWO"
      case '3' => "THREE"
      case '4' => "FOUR"
      case '5' => "FIVE"
      case '6' => "SIX"
      case '7' => "SEVEN"
      case '8' => "EIGHT"
      case '9' => "NINE"
      case _ => "NOT A DIGIT"
    }
    
    println(result)
  }
}