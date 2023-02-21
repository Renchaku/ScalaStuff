

object SumOfTwoIsThird {
  def main(args: Array[String]): Unit = {
    println("Enter first number ")
    var a: Int = readInt()
    println("Enter second number")
    var b: Int = readInt()
    println("Enter third number")
    var c: Int = readInt()
    
    if (a + b == c) {
      println("YES")
    }
    else {
      println("NO")
    }
  }
}