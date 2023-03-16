

object FFargs {
  
  def lastName(name: String):String={
    name.split(" ")(1)
  }
  
  def lt(x:String, y:String): Boolean = {
    lastName(x)<lastName(y)
  }
  
  def main(args: Array[String]): Unit = {
    var names: List[String] = List("Stefan Kuhn","Luke Atwood","Usama Mannai","Stuart O'Connor","Bello Bello")
    println(List("Stefan Kuhn","Luke Atwood","Usama Mannai","Stuart O'Connor","Bello Bello").sortWith(lt))
  
  }
  
}