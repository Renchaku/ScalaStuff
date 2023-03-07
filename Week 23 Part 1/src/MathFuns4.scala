

object MathFuns4 {
  def incr (x: Int): Int = x+1
  def sqr (x: Int): Int = x*x
  def dbl (x: Int): Int = x*2
  def main(args: Array[String]): Unit = {
    println(dbl(5))
    println((1 to 10) map dbl)
    println((1 to 10) map incr map dbl)
    println((1 to 10) map sqr map incr map dbl)
  }
}