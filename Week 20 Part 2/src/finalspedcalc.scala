import scala.io.StdIn.readInt

object finalspedcalc {
  def main(args: Array[String]): Unit = {
    println("Enter initial speed ")
    var initialspeed: Int = readInt()
    println("Enter acceleration ")
    var acceleration: Int = readInt()
    println("Enter time in seconds ")
    var time: Int = readInt()
    
    var finalSpeed: Int = initialspeed + acceleration * time
    
    println("the final speed is " + finalSpeed)
  }
}