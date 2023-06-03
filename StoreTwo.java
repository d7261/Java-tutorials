  
public class StoreTwo {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public StoreTwo(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }
  
  public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";
  }

  // main method
  public static void main(String[] args) {
    StoreTwo lemonadeStand = new StoreTwo("Lemonade", 3.75);
    StoreTwo cookieShop = new StoreTwo("Cookies", 5);

    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }
}
