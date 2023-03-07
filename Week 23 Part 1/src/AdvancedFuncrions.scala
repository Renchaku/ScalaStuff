

object AdvancedFuncrions {
def prime(x: Long) : Boolean = 
    (x==2) || (x>1) && (x%2==1) && 
    ((3 to Math.round(Math.sqrt(x)).toInt by 2) forall (x % _ != 0))
   def main(args: Array[String]): Unit = {
     println((1L to 100L) filter prime)
   }
}