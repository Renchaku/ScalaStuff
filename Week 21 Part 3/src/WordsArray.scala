

object WordsArray {
  def main(args: Array[String]): Unit = {
    println("How many words would you like to store? ")
    var size = readInt()
    
    var wordlist = new Array[String](size)
    var totalLength: Int = 0
    var i = 0
    while (i < wordlist.length) {
      println("Word " + (i+1) + " ? ")
      wordlist(i) = readLine()
      totalLength = totalLength + wordlist(i).length
      i += 1
    }
    
    i = 0
    while (i < wordlist.length) {
      println(wordlist(i).toUpperCase)
      i += 1
    }
    
    var avglength = totalLength / wordlist.length
    println("The average length of the " + wordlist.length + " words is\r" + avglength + " characters")

  }

}