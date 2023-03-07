

object AdvancdFunctions2 {
  def isPerfect(x: Long): Boolean = {
     var sum:Long=0
     for(i <- 1 until x.intValue()){
       if(x%i==0)
         sum += i
     }
     return x==sum
   }
  def main(args: Array[String]): Unit = {
    println((1L to 10000L) filter isPerfect)
  }
}