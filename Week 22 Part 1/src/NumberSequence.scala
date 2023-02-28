

object NumberSequence {
  def main(args: Array[String]): Unit = {
    println("Enter start number: ")
    var start: Int = readInt()
    
    println("Enter end number: ")
    var end: Int = readInt()
    
    if (start < end) {
      for (x <- start to end) {
        println(x)
      }
    }
    
    else if (start > end) {
      for (x <- start to end by -1) {
        println(x)
      }
    }
    else {
      println(start)
    }
  }
}