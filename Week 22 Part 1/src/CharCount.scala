import scala.io.StdIn.readLine

object CharCount {
  def main(args: Array[String]): Unit = {
    println("Enter a sentence: ")
    var sentence = readLine()
    
    sentence = sentence.toLowerCase()
    
    var count = new Array[Int](26)
    
    for (x <- sentence if x.isLetter) {
      count(x-97) += 1
    }
    
    for (x <- 'a' to 'z') {
      print(x + ": " + count(x-97) + " ")
    }
  }
}