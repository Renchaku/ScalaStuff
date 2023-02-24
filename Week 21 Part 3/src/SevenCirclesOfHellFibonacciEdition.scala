

object SevenCirclesOfHellFibonacciEdition {
  def main(args: Array[String]): Unit = {
    println("How many fibonacci numbers? ")
    var size = readInt()
    
    var fibonacci = new Array[Int](size)
    var i = 0
    var first: Int = 1
    var second: Int = 1
    var third: Int = first + second 
    while (i < fibonacci.length) {
      
      if (i < 2){
        fibonacci(i) = first
        second = 2
        i += 1
      }
      else if (i >= 2) {
        third = first + second
        first = second
        second = third
        fibonacci(i) = third
        
        i += 1
      }

    }
    println("The first " + size + " fibonacci numbers are: ")
    i = 0
    while (i < fibonacci.length) {
      print(fibonacci(i) + ", ")
      i += 1
    }

  }
  
}

//This was hell on earth to make