public class StPatricks {
  int students;

  public StPatricks(int numStudents){
    students = numStudents;
  }
public int boysInSchool(){
  int numOfGirls = 200;
  int numOfBoys = students - numOfGirls;
  return numOfBoys;

}
public static void main(String args[]){
  StPatricks formFour = new StPatricks(399);
  System.out.println("The number of boys in St Patrick is: " + formFour.boysInSchool());
}
}
