import scala.io.StdIn._

object studycode {
  def main(args: Array[String]): Unit = {
    print("Enter your first name ")
    var firstName: String = readLine()
    var lastName: String = readLine("Enter your last name ")
    //They do the same thing
    println("Your name is " + firstName + " " + lastName)
  }
}