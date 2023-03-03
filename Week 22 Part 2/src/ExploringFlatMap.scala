

object ExploringFlatMap {
  def main(args: Array[String]): Unit = {
    println("1.Flattering:")
    
    var xs = List("apple","banana","pear","grape","kiwi")
    
    var ys: List[Char] = xs.flatMap(x => x)
    println(ys)
    println(xs.flatten)
    
    var nums = List(List(1,2,3),List(4,5,6))
    println(nums.flatMap(x => x))
    
    println("\n2. Flat mapping:")
    println(xs.flatMap(x => x.take(3)))
    
    var nums2 = List(1,2,3,4,5,6)
    println(nums2.flatMap(x => List(x, x+1)))
    
    println("\n3. Flatmap followed by map:")
    println(xs.flatMap(x => x.take(3)).map(y => y.toUpper))
    
    println("\n4. Combining operations:")
    
    nums.flatMap(x => x.dropRight(1)).map(x => x * 2).filter(x => x > 5).foreach(x => print(x + " "))
    
    println()
    
    (1 to 5).flatMap(i => (1 to i)).map(j => j * 2).foreach(x => print(x + " "))
    
    println()
    
    (1 to 5).flatMap(i => (1 to i)).map(j => j * 2).foreach(x => print(x + " "))
    
    println()
    
    (1 to 5).flatMap(i => (1 to i).map(j => j * 2)).foreach(x => print(x + " "))
    
    println()
    
    (1 to 5).flatMap(i => (1 to i).map(j => i * j)).foreach(x => print(x + " "))
    
    
    
  }
}