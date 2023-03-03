

object ExploringFilter {
  def main(args: Array[String]): Unit = {
    println("1. Filtering list elements:")
    var words = List("apple","banana","pear","grape","kiwi")
    
    var filteredWords = words.filter(x => x.length() > 4)
    println(filteredWords)
    
    println()
    
    words.filter(x => !x.startsWith("b")).foreach(println)
    
    var nums = List.range(1,30).filter(_ % 3 == 0)
    println(nums)
    
    println("\n2. Filtering characters in string:")    
    
    "Some kind of sentence".filter(_.isLetter).foreach(x => print(x.toUpper + "-"))
    
    println("\n\n3. Filtering array elements:")
    
    Array(2.0, 5.0, -1.5, 6.6, -2, 0).filter(_ >= 0 ).foreach(x => print(x + " "))
    
    println("\n")
    
    "The quick brown fox jumps ovr the lazy dog".filter(x => x > 'u').foreach(println)
    
    var numb = List.range(1,11).filter(_ < 6)
    println(numb)
    
    "umm actually".filter(_.isLetter).foreach(x => print(x.toUpper + " "))
  }
}