import java.util.Scanner;

public class SimpleIfDemo {
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.println("enter an Interger");
    int number =input.nextInt();
    if(number % 2 == 0) {
      System.out.println("its an even number");

    } else{
      System.out.println("its an odd number");
    }

  }
}
