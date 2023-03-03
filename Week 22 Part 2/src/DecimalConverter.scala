

object DecimalConverter {
  def main(args: Array[String]): Unit = {
    (1 to 9).map(0.1 * _).foreach(x => print(f"$x%1.1f "))
    
    println("\n")
    
    var nums = List(2.22, 55.562, 1.1, 0.54, 41.643)
    
    var strs = nums.filter(_ > 1).map(x => f"$x%1.2f ")
    
    strs.foreach(println)
  }
}