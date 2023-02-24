

object UsingArrays {
  def main(args: Array[String]): Unit = {
    var letters = new Array[Char] (5)
    letters(0) = 'a'
    letters(1) = 'b'
    letters(2) = 'c'
    letters(3) = 'd'
    letters(4) = 'e'
    
    println("The letters in your array are: ")
    println(letters(0))
    println(letters(1))
    println(letters(2))
    println(letters(3))
    println(letters(4))
  }
}