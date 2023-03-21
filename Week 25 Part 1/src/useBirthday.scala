

object useBirthday {
  def main(args: Array[String]): Unit = {
    var pb: List[Birthday] = List(new Birthday(1, "February", 2003, "Alex"),
        new Birthday(19, "October", 1999, "Erin"),
        new Birthday(9, "August", 2004, "Ben"),
        new Birthday(25, "November", 2001, "Dean"),
        new Birthday(19, "January", 1998, "Linda"),
        new Birthday(30, "July", 1995, "Alex"),
        new Birthday(18, "March", 2003, "Hope"))
    println("Filter: Day = 19\n")
    pb.filter(x => x.getDay == 19).foreach(x => println(x.getName))
    
    println("\nFilter: Name = Alex\n")
    pb.filter(x => x.getName == "Alex").foreach(x => println(x.getDay + " " + x.getMonth + " " + x.getYear))
    
  }
}