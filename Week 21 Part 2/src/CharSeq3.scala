object CharSeq3 {
  def main(args: Array[String]): Unit = {
    println("Start character? ")
    var start: Char = readChar()
    
    println("end character? ")
    var end: Char = readChar()
    
    if (start < end) {
      while (start <= end) {
        print(start + " ")
        start = (start + 1).toChar 
        }
      }
    else if (start > end) {
      while (end <= start) {
        print(start + " ")
        start = (start -1).toChar }
      }
    else {
      println("you so funny")
    }
    }
  }