

object Pattern {
  def main(args: Array[String]): Unit = {
    val rows, cols = 20
    val on = 'X'
    val off = ' '
    
    (0 until rows).foreach(i => {
      (0 until cols).foreach(j => print(" " + (if (i % 4 != j % 4) on else off))); println()
    })
  }
}