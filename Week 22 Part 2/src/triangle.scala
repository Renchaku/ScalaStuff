

object triangle {
  def main(args: Array[String]): Unit = {
    print("Select height")
    val baseHeight = readInt()
    
    (1 to baseHeight).map(x => "* " * x).foreach(println)
  }
}