

object FilterAndReplace {
  def main(args: Array[String]): Unit = {
    println("Enter a sentence: ")
    var sentence = readLine()
    
    var filtered = for (x <- sentence if x != ' ') yield x
    println(filtered)
    
    var replaced = for (x <- sentence) yield if (x != ' ') x else '*'
      println(replaced)
      
      var lengths = for (word <- sentence.split(" ").toList) yield word.length
      println(lengths)
  }
}