public class Dog {
  //fields
  int barks;
//constructor methods
  public Dog(int numOfBarks){
    barks = numOfBarks;
  }
//method
  public void nameOfDog(){
    System.out.println("The name of the dog is Tom");
    System.out.println("Tom barks " + barks + " times.");
  }
  //main method
  public static void main(String args[]){
    //object
    Dog umbwaMwitu = new Dog(7);
//calling the method
    umbwaMwitu.nameOfDog();

  }
}
