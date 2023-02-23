

object OneToX {
  def main(args: Array[String]): Unit = {
    println("Type in a maximum between 2 - 1000: ")
    var max = readInt()
    var count: Int = 1
    
    while (count <= max) {
      println(f"$count%4d")
      count = count + 1
    }
  }
}