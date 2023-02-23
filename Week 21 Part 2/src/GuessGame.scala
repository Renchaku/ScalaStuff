

object GuessGame {
  def main(args: Array[String]): Unit = {
    var guess: Int = 5
    println("Guess the number: ")
    var userguess: Int = readInt()
    var guesscount: Int = 1
    
    while (guess != userguess) {
      if (guess < userguess) {
        println(userguess + "? Lower! ")
        userguess = readInt()
        guesscount = guesscount + 1
      }
      else if (guess > userguess) {
        println(userguess + "? Higher! ")
        userguess = readInt()
        guesscount = guesscount + 1
      }
      
    }
    if (guesscount == 1) {
      println("Correct - this took you " + guesscount + " guess!") }
    else {
      println("Correct - this took you " + guesscount + " guesses")
    }
  }
}