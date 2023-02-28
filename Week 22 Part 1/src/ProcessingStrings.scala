

object ProcessingStrings {
  def main(args: Array[String]): Unit = {
    println("Type in a sentence: ")
    var sentence = readLine()
    
    for ( x<- sentence) {
      println(x)
    }
    
    var letterCount = 0
    for (x <- sentence if x.isLetter) {
      println("Letter: " + x)
      letterCount += 1
    }
    
    var intCount = 0
    for (x <- sentence if x.isDigit) {
      println("Number: " + x)
      intCount += 1
    }
    
    println("Number of letters? " + letterCount)
    println("Number of numbers? " + intCount)
  }
}