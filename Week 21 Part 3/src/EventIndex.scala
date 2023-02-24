

object EventIndex {
  def main(args: Array[String]): Unit = {
    var nums = Array(1,2,3,4,5,6,7,8,9,10)
    
    var i = 0
    while (i < nums.length) {
      println("Index: " + i + " ; Value: " + nums(i))
      i += 2
    }
  }
}