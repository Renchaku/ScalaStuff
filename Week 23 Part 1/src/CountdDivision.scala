

object CountdDivision {
  def countDivisors(n: Int): Int = {
    var d: Int = 0
    for (k <- 1 until n)
      if (n%k==0)
        d = d + 1
    d
  }
  def main(args: Array[String]): Unit = {
    println((1 to 10) map countDivisors)
    println(countDivisors(10))
  }
}