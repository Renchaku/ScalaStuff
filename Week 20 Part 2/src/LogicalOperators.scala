

object LogicalOperators {
  def main(args: Array[String]): Unit = {
    
    print("Enter a boolean value ")
    var a: Boolean = readBoolean()
    print("Enter another another boolean value ")
    var b: Boolean = readBoolean()
    
    
    println(a + " AND " + b + " is " + (a && b))
    println(a + " OR " + b + " is " + (a || b))
  }
}