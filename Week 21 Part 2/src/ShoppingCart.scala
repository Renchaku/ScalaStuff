

object ShoppingCart {
  def main(args: Array[String]): Unit = {
    println("Enter the price of the product: ")
    var price: Double = readDouble()
    var total: Double = 0 + price
    while (price > 0) {
       println("Enter the price of another product: ")
       price = readDouble()
       total = price + total
     }
    println("The total is: " + total)
  }
}