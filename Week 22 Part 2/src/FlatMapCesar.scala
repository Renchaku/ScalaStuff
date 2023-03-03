
import scala.io.StdIn._

object FlatMapCaesar {
  def main(args: Array[String]): Unit = {
    var words = Array("Mse", "crete", "t", "messiah", "s", "ageing")
    
    println("Enter a rotation: ")
    var rotate = readInt()
    
    var letters = words.flatMap(x => x.take(3)).filter(x => x.isLower)
    
    var shiftedLetters = letters.map(x => (x + rotate).toChar)

    println()
    
    (0 until letters.length).foreach(x => println(letters(x) + " -> " + shiftedLetters(x)))
    
  }
}