

object PrintingNumbers {
  def main(args: Array[String]): Unit = {
    println("Using 'to':")
    for (x <- 1 to 10) {
      print(x + " ")}
    
    println("\n\nUsing 'until':")
    for (x <- 1 until 10) {
      print(x + " ")
    }
    
    println("\n\nUsing 'by':")
    for (x <- 1 to 10 by 2) {
      print(x + " ")}
    
    println("\n\nUsing 'by':")
    for (x <- 10 to 1 by -1) {
      print(x + " ")
    }
  }
}