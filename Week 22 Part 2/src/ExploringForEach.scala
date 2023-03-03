object ExploringForEach {
  def main(args: Array[String]): Unit = {
    
    println("1. For each on ranges:")
    
    (1 to 10).foreach(x => print(x + " "))
    
    println()
    
    (1 until 10).foreach(print(_))
    
    println()
    
    (1 to 10 by 2).foreach(print)
    
    
    println("\n\n2. For each on lists:")
    
    List.range(1, 10).foreach(x => {
      print(x + " ")
      print((x * 2) + " ")
    })
    
    println()
    
    var words = List("apple", "banana", "pear")
    words.foreach(x => println(x.substring(0,3)))
    
    println("\n3. For each on strings:")
    
    "Hello World".foreach(x => print(x.toUpper))
    
    println()
    
    "abcdefg".foreach(x => print((x + 1).toChar))
    
    println()
    
    var nums = Array(Array(1,2,3), Array(4,5,6,7))
    nums.foreach(x => print(x.length + " "))
    
    println()
    
    nums.foreach(arr => arr.foreach(elem => print(elem)))
    
    println()
    
    nums.foreach(_.foreach(print(_)))
    
    println()
    
    "b2b3".foreach(x => print((x -4).toChar))
    
    println()
    
    "Hello World".foreach(x => print(x + 1))
  }
}