

object Letters {
  def main(args: Array[String]): Unit = {
    println("Enter a character")
    var x: Char = readChar()
    
    
    
    var result = x match {
      
      case 'a' => "VOWEL"
      case 'e' => "VOWEL"
      case 'i' => "VOWEL"
      case 'o' => "VOWEL"
      case 'u' => "VOWEL"
      case _ => "CONSTANT"
    }
    println(result)
  }
}