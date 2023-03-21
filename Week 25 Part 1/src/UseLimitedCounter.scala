

object UseLimitedCounter {
  def main(args: Array[String]): Unit = {
    var counter2: LimitCounter = new LimitCounter
    println("Enter upper limit")
    var userUpper: Int = readInt()
    
    counter2.setUpperLimit(userUpper)
    
    println("Enter lower limit")
    var userLower: Int = readInt()
    
    counter2.setLowerLimit(userLower)
    var continue: String = ""
    do {
      var choice: String = readLine("inc or dec ")
      if (choice == "inc") {
        println("Increase by? ")
        var userInc: Int = readInt()
        do {
          counter2.inc
          userInc -= 1
        } while (userInc != 0)
      }
    
      else if (choice == "dec") {
        println("Decrease by? ")
        var userDec: Int = readInt()
        do {
          counter2.dec
          userDec -= 1
        } while(userDec != 0)
      }
      continue = readLine("Continue? y/n ")
    } while(continue == "y")
    
    
    println("Counter 2: "+counter2.getValue)
  }
}