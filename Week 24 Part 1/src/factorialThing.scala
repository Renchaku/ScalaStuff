

object factorialThing {
  def factorial(n: Long): Long = {
    if (n == 0)
      1
    else
      n * factorial(n - 1)
  }
  
  def main(args: Array[String]): Unit = {
    println("Enter a number to factor it or whatever: ")
    var a: Int = readInt()
    println(factorial(a))
  }
}