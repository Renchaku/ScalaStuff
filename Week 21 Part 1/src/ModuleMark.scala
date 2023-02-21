

object ModuleMark {
  def main(args: Array[String]): Unit = {
    println("Enter percentage grade of coursework")
    var course: Int = readInt()
    if (course > 100) {
      println("You did not enter a valid percentage!")
    }
    else if (course < 0) {
      println("Last time I checked, you cannot LOSE marks")
    }
    else {
      println("Enter percentage grade of exam")
      var exam: Int = readInt()
      if (exam > 100) {
        println("You did not enter a valid percentage!")
      }
      else if (exam < 0) {
        println("One time is funny, two time is annoying, no?")
      }
      else {
        var overall: Int = (course + exam) / 2
        if (overall < 40) {
          if (exam < 40) {
            println("You have to resit exam")
            if (course < 40) {
              println("You have to resit coursework too")
            }
          }
          else if (course < 40) {
            println("You have to resit coursework")  
          }
          else {
            println("Error!!!")
          }
          
        }
        else if(overall >= 40) {
          println("You passed!")
        }
      }
    }
  }
}