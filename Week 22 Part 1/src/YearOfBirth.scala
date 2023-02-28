

object YearOfBirth {
  def main(args: Array[String]): Unit = {
    println("Enter year of birth: ")
    var startYear: Int = readInt()
    var years = for (x <- (startYear to 2023).toList) yield x
    println(years)
    println("\n")
    for (x <- startYear to 2023) {
      println(x)
    }
  }
}