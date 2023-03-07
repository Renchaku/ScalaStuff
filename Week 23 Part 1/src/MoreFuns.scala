

object MoreFuns {
  val incr: Int => Int = x => x+1
  def main(args: Array[String]): Unit = {
    println((1 to 10) map incr)
    println((1 to 10) map incr map incr)
    
    println("\n")
    
    println((1 to 10) map (x => x+1))
    
    println((1 to 10) map (x => x + 10 + 3))
    
    println((1 to 10) map (x => x + 10 + 3) filter (n => n%3==0))
  }
}