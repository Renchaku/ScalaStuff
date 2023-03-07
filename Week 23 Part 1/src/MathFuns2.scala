

object MathFuns2 {
  def decr(x: Int): Int = x-1
   def main(args: Array[String]): Unit = {
     println(decr(5))
     println((1 to 10) map decr)
     println((1 to 10) map decr map decr)
   }
}