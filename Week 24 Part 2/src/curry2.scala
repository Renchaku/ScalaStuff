

object curry2 {
  def eq(c: Char)(d: Char) = c==d
  def maj(c: Char)(d: Char) = c<d
  def min(c: Char)(d: Char) = c>d
  def not(c: Char)(d: Char) = c!=d
  def main(args: Array[String]): Unit = {
    println("aardvark".toList filter (eq('a')))
    println("aardvark".toList filter (maj('f')))
    println("aardvark".toList filter (min('j')))
    println("aardvark".toList filter (not('a')))
  }
}