

object MathFuns3 {
  def sqr (x: Int): Int = x*x
  def incr (x: Int): Int = x+1
  def main(args: Array[String]): Unit = {
    println(sqr(5))
    println((1 to 10) map sqr)
    println((1 to 10) map sqr map sqr)
    println((1 to 10) map sqr map sqr map incr)
  }
}