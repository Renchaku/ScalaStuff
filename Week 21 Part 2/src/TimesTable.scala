

object TimesTable {
  def main(args: Array[String]): Unit = {
    println("Enter an integer: ")
    var num = readInt()
    var count: Int = 1
    
    while (count < 13) {
      var result: Int = count * num
      println(count + " x " + num + " = " + result)
      count = count + 1
    }
    
  }
}