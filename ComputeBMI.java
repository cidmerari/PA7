import java.util.Scanner;
public class ComputeBMI{
  public static void public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double KILOGRAMS_PER_POUND =0.4535923;
    final double METERS_PER_INCH = 0.0254;

    System.out ,println("enter weight in pounds :");
    double weigh = input.nextDouble();

    System.out.System.out.println("Enter height in inches");
    double height= input.nextDouble();


    double weightInKlograms = weight* KILOGRAMS_PER_POUND;
    double heightInMeters = height* METERS_PER_INCH;




  }

}
