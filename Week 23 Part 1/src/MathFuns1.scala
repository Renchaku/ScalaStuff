

object MathFuns1 {
  def incr(x: Int): Int = x+1
  
  def main(args: Array[String]): Unit = {
    println(incr(5))
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)
  }
}