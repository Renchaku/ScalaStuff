

object MyFuns2 {
  def even (x: Int): Boolean = x%2==0
  def sqr (x: Int): Int = x*x
  def odd (x: Int): Boolean = x%2==1
  def inv (x: Boolean): Boolean = !x
  def negative (x: Int): Boolean = x<0
  def pal (x: String): Boolean = x == List("racecar", "dad", "mom", "rotator")
  def strlen (x: String): Int = x.length
  def bracket (x: String): String = "\"" + x + "\""
  def main(args: Array[String]): Unit = {
    println((1 to 10) filter even)
    println((-5 to 5) filter negative)
    println((1 to 10) map even map inv)
    println(pal("hello"))
    println(pal("mom"))
    println(bracket("Hello World")) 
  }
}