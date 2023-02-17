

object SumSqToN {
  def main(args: Array[String]): Unit = {
    println("Enter a number ")
    var n: Int = readInt()
    var sumSq: Int = n * (n + 1) * (2 * n + 1) / 6
    
    println("The sum squared of " + n + " is "  + sumSq)

    
  }
}