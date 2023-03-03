

object Rectangle {
  def main(args: Array[String]): Unit = {
    println("Select how many units for the height? ")
    var recheight = readInt()
    
    println("Select how many units for the width? ")
    
    var recwidth = readInt()
    
    (1 to recheight).map(x => "* " * recwidth).foreach(println)
  }
}