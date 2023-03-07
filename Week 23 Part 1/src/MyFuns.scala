

object MyFuns {
  def even (x: Int): Boolean = x%2==0
  def sqr (x: Int): Int = x*x
  def main(args: Array[String]): Unit = {
    println(even(5))
    println(even(6))
    println((1 to 10) map even)
    println((1 to 10) filter even)
    println((1 to 10) filter even map sqr)
  }
}