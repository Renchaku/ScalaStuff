

object WordFilter {
  def main(args: Array[String]): Unit = {
    var count = 0
    
    var words = new Array[String](5)
    while (count < 5) {
      println("Enter a word")
      words(count) = readLine()
      count += 1
    }
    
    var chars = new Array[Char](5)
    
    count = 0
    
    while (count < 5) {
      println("enter a character")
      chars(count) = readChar()
      count += 1
    }
    
    words.filter( x => chars.contains(x.charAt(0))).foreach(println)
    
  }
}