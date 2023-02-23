

object Triangle1 {
  def main(args: Array[String]): Unit = {
    print("Select how many unit sor the base of the trangle?" )
    val baseHeight = readInt()
    println()
    var row : Int = 1
    
    while (row <= baseHeight) {
      var col: Int = 1
      while (col <= row) {
        print("* ")
        col += 1
      }
      
      print("\n")
      row += 1
    }
  }
}