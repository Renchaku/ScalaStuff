

object SimpleList {
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List(4,1,8,45,3)
    
    println(xs)
    println(xs.head)
    println(xs.tail)
    println(xs.isEmpty)
    println(xs.tail.isEmpty)
    
    var xs2: List[Int] = xs.tail.tail.reverse
    println(xs2)
    
  }
}