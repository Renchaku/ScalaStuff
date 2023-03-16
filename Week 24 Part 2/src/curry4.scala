

object curry4 {
  def bracket(words: String) = "\"" + words + "\""
  
  def main(args: Array[String]): Unit = {
    println(bracket("Hello World"))
  }
}