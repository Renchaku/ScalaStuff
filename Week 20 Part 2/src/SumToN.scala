

object SumToN {
  def main(args: Array[String]): Unit = {
    println("Enter a value ")
    var numberN: Int = readInt()
    var sum: Int = numberN * (numberN + 1) / 2
    println("THe sum from 1 to 10 is " + sum)
  }
}