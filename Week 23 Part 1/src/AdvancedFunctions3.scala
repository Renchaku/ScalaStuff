

object AdvancedFunctions3 {
  def digitToWord(x: Int) : String = {
    x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case 5 => "five"
      case 6 => "six"
      case 7 => "seven"
      case 8 => "eight"
      case 9 => "nine"
      case 0 => "zero"
      case _ => "bad digit"
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Please enter a digit: ")
    var digit: Int = readInt()
    
    println("You entered " + (digitToWord (digit)))
  }
}