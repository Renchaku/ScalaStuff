

object InputTenNumbersIntoList {
  def main(args: Array[String]): Unit = {
    println("Enter 1st number ")
    var a: Int = readInt()
    println("Enter 2nd number ")
    var b: Int = readInt()
    println("Enter 3rd number ")
    var c: Int = readInt()
    println("Enter 4th number ")
    var d: Int = readInt()
    println("Enter 5th number ")
    var e: Int = readInt()
    println("Enter 6th number ")
    var f: Int = readInt()
    println("Enter 7th number ")
    var g: Int = readInt()
    println("Enter 8th number ")
    var h: Int = readInt()
    println("Enter 9th number ")
    var i: Int = readInt()
    println("Enter 10th number ")
    var j: Int = readInt()
    
    var xs: List[Int] = List(a, b, c, d, e, f, g, h, i, j)
    
    
    println(xs.reverse)
  }
}