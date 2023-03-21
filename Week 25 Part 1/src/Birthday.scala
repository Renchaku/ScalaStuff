

class Birthday (private var day: Int, private var month: String, private var year: Int, private var name: String) {

  def getInfo: String = s" $name 's birthday is $day $month $year"
  
  def getDay = day
  def getMonth = month
  def getYear = year
  def getName = name
}


