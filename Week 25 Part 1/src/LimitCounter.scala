

class LimitCounter {

  private var counter: Int = 0
  private var lower: Int = 0
  private var upper: Int = 0
  
  def reset(lo: Int, up: Int){
    counter = lo
    lower = lo
    upper = up
  }
  
  def setLowerLimit(lo: Int){
    if(lo < upper) {
      lower = lo
      if(counter < lower) counter = lower
    }
    else println("Lower limit cannot be above the Upper limit " + upper + ", please try aagain")
  }
  
  def setUpperLimit(up: Int){
    if(up > lower) {
      upper = up
      if(counter > upper) counter = upper
    }
    else println("Upper limit cannot be below the Lower limit " + lower + ",please try again")
  }
  
  def setToLowerLimit(){
    counter = lower
  }
  
  def setToUpperLimit(){
    counter = upper
  }
  
  def inc(){
    if(counter == upper) counter = lower
    else counter += 1
  }
  
  def dec(){
    if(counter == lower) counter = upper
    else counter -= 1
  }
  
  def getLowerLimit: Int = lower
  def getUpperLimit: Int = upper
  def getValue: Int = counter
  def isAtLowerLimit: Boolean = counter == lower
  def isAtUpperLimit: Boolean = counter == upper
  
  def setValue(newValue: Int) = {
    if(newValue >= lower && newValue <= upper) counter = newValue
    else println("New counter does not fall within the limits, please try again")
  }
}
