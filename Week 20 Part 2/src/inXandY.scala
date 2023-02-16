

object inXandY {
  def main(args: Array[String]): Unit = {
    print("Enter the first number: ")
    var x: Int = readInt()
    
    print("Enter the second number ")
    var y: Int = readInt()
    
    println("You entered " + x + " and " + y + ".")
    println("The sum of the two numbers is " + (x + y))
    println("The product of the two numbers is " + (x*y))
  }
}