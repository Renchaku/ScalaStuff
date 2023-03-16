

object curry3 {
  def lengthInt(a: Int)(b: String) = a==(b.length)
  
  def main(args: Array[String]): Unit = {
    var words: List[String] = List("apple","pear","banana","kiwi","peach")
    
    println(words filter lengthInt(5))
  }
}