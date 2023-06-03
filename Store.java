public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store cookieShop = new Store("cookies", 12, 3.75);

    System.out.println("Our store sells " + cookieShop.inventoryCount + " " + cookieShop.productType + " at " + cookieShop.inventoryPrice + " shillings.");
    
  }
}