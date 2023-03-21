

class Car(private var color: String, private var make: String,
    private var maxSpeed: Int, private var currentSpeed: Int) {
  
  def this(color: String, make: String, maxSpeed: Int)={
    this(color,make,maxSpeed,0)
  }
  
  def this(color:String, make: String)={
    this(color,make,150)
  }
  
  def accellerate{
    if(currentSpeed<maxSpeed)
      currentSpeed+=1;
  }
  
  def getInfo: String = s"Your $color $make drives at $currentSpeed, but could go $maxSpeed if you want"
}

