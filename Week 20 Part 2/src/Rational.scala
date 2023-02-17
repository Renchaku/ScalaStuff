

object Rational {
  def main(args: Array[String]): Unit = {
    print("enter fist number ")
    var a: Int = readInt()
    
    print("Enter second number ")
    var b: Int = readInt()
    
    println( a + " < " + b + " is " + (a < b))
    println(a + " > " + b + " is " + (a > b))
    println(a + " <= " + b + " is " + (a <= b ))
    println(a + " >= " + b + " is " + (a >= b))
    println(a + " == " + b + " is " + (a == b))
    println(a + " != " + b + " is " + (a != b))
    
    
  }
}