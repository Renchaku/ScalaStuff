

object Pattern {
  def main(args: Array[String]): Unit = {
    var rows, cols = 20
    val on = 'X'
    val off = ' '
    
    var grid = Array.ofDim[Char](rows, cols)
    
    var i, j = 0
    
    while (i < rows) {
      j = 0
      while (j < cols) {
        grid(i)(j) = if (i != j) on else off
        j += 1
        
      }
      i += 1
    }
    
    i = 0
    
    while (i < rows) {
      j = 0
      while (j < cols) {
        print(" " + grid(i)(j))
        j += 1
        
      }
      
      print("\n")
      i += 1
    }
  }
}