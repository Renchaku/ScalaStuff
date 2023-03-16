

object curry1 {
  def add(x: Int)(y: Int) = x+y
  def sub(x: Int)(y: Int) = y-x
  def mul(x: Int)(y: Int) = x*y
  def div(x: Int)(y: Int) = y/x
  def mod(x: Int)(y: Int) = y%x
  
  def main(args: Array[String]): Unit = {
    println((1 to 10)map (add(2)))
    println((1 to 10)map (sub(1)))
    println((1 to 10)map (mul(3)))
    println((1 to 10)map (div(2)))
    println((1 to 10)map (mod(2)))
  }
}