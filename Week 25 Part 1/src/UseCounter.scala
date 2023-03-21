

object UseCounter {
  def main(args: Array[String]): Unit = {
    var counter1: Counter = new Counter()
    println("counter 1: "+counter1.getValue)
    counter1.inc
    println("counter 1: "+counter1.getValue)
    counter1.inc(5)
    println("counter 1: "+counter1.getValue)
    counter1.setValue(5)
    println("Counter 1: "+counter1.getValue)
    counter1.reset()
    println("counter 1: "+counter1.getValue)
    
  }
}