import scala.io.StdIn.readInt

object Rectangle {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the height of the rectangle? ")
    val height = readInt()
    print("Select how many units for the width of the rectangle? ")
    val width = readInt
    
    println()
    
    var row: Int = 1
    
    while (row <= height) {
      
      var col: Int = 1
      
      while (col <= width) {
        print("* ")
        col += 1
      }
      
      print("\n")
      row += 1
    }
    
  }
}