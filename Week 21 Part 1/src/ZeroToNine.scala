

object ZeroToNine {
  def main(args: Array[String]): Unit = {
    println("Enter a DIGIT ")
    var d: Int = readInt()
    if (d == 0) {
      println("ZERO")
    }
    
    else if (d == 1) {
      println("ONE")
    }
    else if (d == 2) {
      println("TWO")
    }
    else if (d == 3) { 
      println("THREE")
    }
    else if (d == 4) {
      println("FOUR")
    }
    else if (d == 5) {
      println("FIVE")
    }
    else if (d == 6) {
      println("SIX")
    }
    else if (d == 7) {
      println("SEVEN")
    }
    else if (d == 8) {
      println("EIGHT")
    }
    else if (d == 9) {
      println("NINE")
    }
    else {
      println("YOU DID NOT ENTER A DIGIT!")
    }
  }
}