import scala.io.StdIn.readChar

object NumberToRainbow {
  def main(args: Array[String]): Unit = {
    println("Type number corresponding to a colour of the rainbow ")
    var digit: Char = readChar()
    
    var colour = digit match {
      case '1' => "Red"
      case '2' => "Orange"
      case '3' => "Yellow"
      case '4' => "Green"
      case '5' => "Blue"
      case '6' => "Indigo"
      case '7' => "Violet"
      case _ => "Digit does not correspond to a colour of the rainbow"
    }
    
    println(colour)
  }
} //Not fond of this