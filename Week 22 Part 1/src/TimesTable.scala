

object TimesTable {
  def main(args: Array[String]): Unit = {
    println("Enter number: ")
    var num: Int = readInt()
    
    for (x <- 1 to 12)
      println(x + " x " + num + " = " + (x*num))
  }
}