import scala.io.StdIn._

object ListMenu {
  def main(args: Array[String]): Unit = {
    println("Enter start value of list ")
    var start = readInt()
 
    print("Enter end value of list (exclusive) ")
    var end = readInt()
 
    var xs = List.range(start, end)
 
    var cmd = ""

    do {
      println("\nMenu\n====")
      println("Take: take from list")
      println("TakeR: take from right of list")
      println("Drop: drop from list")
      println("DropR: drop from right of list")
      println("End: exit program")

      cmd = readLine()
      
      //TO COMPLETE...
      
      
    } while (cmd != "End")
 
    println("Exiting program...")
  }
}