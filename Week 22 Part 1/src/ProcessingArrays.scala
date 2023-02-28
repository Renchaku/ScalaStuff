

object ProcessingArrays {
  def main(args: Array[String]): Unit = {
    var nums = new Array[Int](10)
    
    for (i <- 0 until nums.length) {
      nums(i) = i + 1
    }
    
    for (x <- nums) {
      print(x + " ")
    }
  }
}