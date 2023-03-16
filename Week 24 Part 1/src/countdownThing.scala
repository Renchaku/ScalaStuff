

object countdownThing {
  def countdown(n: Int): Unit = {
    print(s"$n ")
    if (n==0)
      println("Stopped")
    else
      countdown(n-1)
  }
  
  def countTo10(n: Int): Unit = {
    print(s"$n ")
    if (n==10)
      println("Stopped")
    else
      countTo10(n+1)
  }
  
  def countToN(n: Int, e: Int): Unit = {
    var nn: Int = n
    do {
      print(s"$nn ")
      nn += 1
    } while (nn!=e+1)
      
  }
  
  def countToRevN(n: Int, e: Int): Unit = {
    var ee : Int = e
    do {
      print(s"$ee ")
      ee -= 1
    } while (ee!=n-1)
  }
  
  
  def main(args: Array[String]): Unit = {
    
    println(countdown(10))
   
    println(countTo10(5))
    
    println("Enter fist number: ")
    var a: Int = readInt()
    
    println("Enter second number: ")
    var b: Int = readInt()
    println(countToN(a,b))
    
    println(countToRevN(a,b))
  }
}