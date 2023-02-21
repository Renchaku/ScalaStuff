

object ReadDetails {
  def main(args: Array[String]): Unit = {
    var firstName: String = readLine("Enter your first name ")
    var lastName: String = readLine("Enter your last name ")
    
    var error = ""
    
    if (firstName.isEmpty) {
      error += "You did not type in a first name\n"
    }
    
    if (lastName.isEmpty) {
      error += "You did not type in a last name\n"
    }
    
    if (error.isEmpty) {
      println("Your name is " + firstName + " " + lastName)
    }
    
    else {
      println(error)
    }
  }
}