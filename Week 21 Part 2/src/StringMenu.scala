import scala.io.StdIn._

object StringMenu {
  def main(args: Array[String]): Unit = {
    println("Enter a string to analyse ")
    var sentence = readLine()
 
    var cmd = ""

    do {
      println("\nMenu\n====")
      println("Len: string length")
      println("At: character at index")
      println("Sub: substring")
      println("End: exit program")

      cmd = readLine()

      if (cmd == "Len") {
        println("Length is " + sentence.length)

      } else if (cmd == "At") {
        println("Please provide an index")
        var index = readInt()
 
        println("Character at index " + index + " is " + sentence.charAt(index))

      } else if (cmd == "Sub") {
        println("Please provide a start index")
        var sIndex = readInt()
 
        println("Please provide an end index")
        var eIndex = readInt()

        println("Substring between index " + sIndex + " and " + eIndex + " is " + sentence.substring(sIndex, eIndex))
      }

    } while (cmd != "End")

    println("Exiting program...")
  }
}