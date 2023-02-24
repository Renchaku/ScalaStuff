

object DynamicArrays {
  def main(args: Array[String]): Unit = {
    println("How many numbers would you like to store? ")
    var size = readInt()
    
    var nums = new Array[Int](size)
    
    var i = 0
    while (i < nums.length) {
      println("Number " + (i+1) + " ? ")
      nums(i) = readInt()
      i += 1
    }
    
    println("You typed in: ")
    i = 0
    while (i < nums.length) {
      print(nums(i) + " ")
      i += 1
    }
    
    println("\n\nSum of numbers: ")
    var sum = 0
    i = 0
    while (i < nums.length) {
      print(nums(i) + " ")
      i += 1
    }
    
    println(sum)
    
    println("\nSmallest number: ")
    var smallest = nums(0)
    i = 1
    while (i < nums.length) {
      if (nums(i) < smallest) {
        smallest = nums(i)
      }
      i += 1
    }
    println(smallest)
    
    println("\nIndex of largest number: ")
    var largestIndex = 0
    var largest = nums(0)
    i = 1
    while (i < nums.length) {
      if (nums(i) > largest) {
        largestIndex = 1
      }
      
      i += 1
    }
    
    println("\nNumber of negative numbers: ")
    var count =0
    i = 0
    while(i < nums.length) {
      if (nums(i) < 0) {
        count += 1
      }
      i += 1
    }
    
    println(count)
    
    println("\nSearch for which number? ")
    var lookup = readInt()
    var found = false
    i = 0
    while (i < nums.length && found == false) {
      if (nums(i) == lookup) {
        found = true
      }
      i += 1
    }
    println("Number found? " + found)
  }
}