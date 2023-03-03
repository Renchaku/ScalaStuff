import scala.io.StdIn.readInt

object MappedTriange2 {
  def main(args: Array[String]): Unit = {
    print("Select how many units fr the base and height of the triagle? ")
    val baseHeight = readInt()
    
    (baseHeight to 1 by -1).map(x => "* " * x).foreach(println)
    
  }
}