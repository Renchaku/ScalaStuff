

object InputTenNumbersMoreEfficient {
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List()
    println("1st number ")
    xs = xs:+ readInt()
    println("2d number ")
    xs = xs:+ readInt()
    println("3rd number ")
    xs = xs:+ readInt()
    println("4th number ")
    xs = xs:+ readInt()
    println("5th number ")
    xs = xs:+ readInt()
    println("6th number ")
    xs = xs:+ readInt()
    println("7th number ")
    xs = xs:+ readInt()
    println("8th number ")
    xs = xs:+ readInt()
    println("9th number ")
    xs = xs:+ readInt()
    println("10th number ")
    xs = xs:+ readInt()
    println(xs.reverse)
    
  }
    
}