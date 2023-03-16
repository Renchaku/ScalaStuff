

object SumFromToThing {
  def sumFromTo(s: Int, e: Int): Int = {
    if (s == e)
      s
    if (s>e)
      0
    else
      s + sumFromTo(s + 1, e)
  }
  
  def main(args: Array[String]): Unit = {
    println("Enter first value: ")
    var a: Int = readInt()
    println("Enter second value: ")
    var b: Int = readInt()
    
    println("\n")
    println(sumFromTo(a,b))
  }
}