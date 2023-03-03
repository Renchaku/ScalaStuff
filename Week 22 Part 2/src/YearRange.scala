

object YearRange {
  def main(args: Array[String]): Unit = {
    println("Enter a year: ")
    var year: Int = readInt()
    (year to 2023).filter(x => x % 4 != 0).foreach(println)
  }
}