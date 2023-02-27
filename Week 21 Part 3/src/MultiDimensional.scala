import scala.io.StdIn.readInt

object MultiDimensional {
  def main(args: Array[String]): Unit = {
    println("Rows? ")
    var rows = readInt()
    
    println("Cols? ")
    var cols = readInt()
    
    var table = Array.ofDim[Int](rows, cols)
    var i = 0
    
    while (i < table.length) { 
      var j = 0
      while (j < table(i).length) {
        table(i)(j) = i + j
        j += 1
      }
      i += 1
    }
    
    i = 0
    
    while (i < table.length) {
      var j = 0
      while (j < table(i).length) {
        print(f"${table(i)(j)}%4d")
        j += 1
      }
      print("\n")
      i += 1
    }
    
    
    
  }
}