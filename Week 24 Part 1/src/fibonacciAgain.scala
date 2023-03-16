

object fibonacciAgain {
  def fibonacci(n: BigInt): BigInt = 
    if (n==0) 0
    else if (n==1) 1
    else fib(0,1, n-2)
    
  def fib(a: BigInt, b:BigInt, n:BigInt): BigInt =
    if (n==0) a+b
    else fib(b, a+b, n-1)
    
  def main(args: Array[String]): Unit = {
    println("Enter number: ")
    var a: Int = readInt()
    
    println(fibonacci(a))
  }
}