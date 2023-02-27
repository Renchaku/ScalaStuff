import scala.io.StdIn.readChar

object LettersMatch {
  def main(args: Array[String]): Unit = {
    var choice = ' '
    var letters = new Array[Int](7)
    do {
      println("Type in a character (! to stop) ")
      choice = readChar()
      choice = choice.toLower
      if (choice.isLetter) {
        choice match {
          case 'a' => letters(0) += 1
          case 'e' => letters(1) += 1
          case 'i' => letters(2) += 1
          case 'o' => letters(3) += 1
          case 'u' => letters(4) += 1
          case _ => letters(5) += 1
        }
      } else {
        letters(6) += 1
      }
    } while (choice != '!')
      
      println("In total you entered the following: ")
      println("a: " + letters(0))
      println("e: " + letters(1))
      println("i: " + letters(2))
      println("o: " + letters(3))
      println("u: " + letters(4))
      println("Consonant: " + letters(5))
      println("Non-Alpha: " + letters(6))
  }
}