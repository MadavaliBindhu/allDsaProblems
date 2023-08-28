//Write a program to sum all the elements present in an array.

public class Main {
  public static void main(String[] args) {
    int[] myArray = {1,8,2, 10, 10, 25};
    int sum = 0;
    int i; 
    for (i = 0; i < myArray.length; i++) {
      sum += myArray[i];
    }
    System.out.println("The sum is: " + sum);
  }
}
