

object OddEven {
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number: Int = readInt()
    
    var result = if (number % 2 == 0)
      "even"
    else
      "odd"
    println("Your number is " + result )
  }
}