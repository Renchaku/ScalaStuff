

object ExploringMap {
  def main(args: Array[String]): Unit = {
    println("1. Mapping list elements:")
    
    var words = List("apple","banana","pear","grape","kiwi")
    var shortened = words.map(x => x.substring(0,4))
    println(shortened)
    
    var lengths = words.map(x => x.length)
    println(lengths)
    
    println("\n2. Mapping array elements:")
    
    var data = Array(2.0, 5.0, -1.5, 6.6, -2, 0)
    
    var strData: Array[String] = data.map(x => x.toString)
    println(strData.mkString(" "))
    
    println("\n3. Mapping characters in a string:")
    
    var sentence = "Mary had a little lamb"
    var flipped = sentence.map(x => if (x.isUpper) x.toLower else x.toUpper)
    println(flipped)
    
    println("\n4. Mapping ranges:")
    
    (1 to 10).map(x => -x).foreach(x => print(x + " "))
    
    println()
    
    ('a' to 'e').map(c => c + 1).foreach(x => print(x + " "))
    
    ('a' to 'e').map(c => (c + 1).toChar).foreach(x => print(x + " "))
    
    println("\n\n5. Mapping, filtering and foreach:")
    
    var nums = Array(Array(1,2,3), Array(4,5,6,7), Array(9,10,11))
    
    nums.map(x => x.sum).filter(x => x > 10).foreach(x => print ("sum: " + x + " "))
    
    println()
    
    List.range(1,101).filter(x => x % 2 == 0 && x > 60).map(x => x.toDouble).foreach(x => print(x + " "))
    }
}