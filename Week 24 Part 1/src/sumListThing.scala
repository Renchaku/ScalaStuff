

object sumListThing {
  def sumList(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + sumList(xs.tail)
  }
  
  
  def main(args: Array[String]): Unit = {
    println(sumList(List()))
    println(sumList(List(1)))
    println(sumList(List(2,4,7,9)))
    println(sumList((1 to 20).toList))
  }
}