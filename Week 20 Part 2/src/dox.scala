

object dox {
  def main(args: Array[String]): Unit = {
    var initial: String = readLine("Your initial ")
    var houseNumber: String = readLine("Your house number ")
    var houseAddress: String = readLine("Your address ")
    var telephoneNumber: String = readLine("your telephone number ")
    var salary: String = readLine("Your salary ")
    
    println("Your initial is " + initial + ", you live at " + houseNumber + ", " + houseAddress)
    println("Your phone number is " + telephoneNumber + " and your salary is " + salary)
    
  }
}