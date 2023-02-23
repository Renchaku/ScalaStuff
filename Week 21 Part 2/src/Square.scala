import scala.io.StdIn.readInt

object Square {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the height and width of the square? ")
    val heightWidth = readInt()
    
    println()
    
    var row: Int = 1
    
    while (row <= heightWidth) {
      
      var col: Int = 1
      
      while (col <= heightWidth) {
        print("* ")
        col += 1
      }
      
      print("\n")
      row += 1
    }
    
  }
}