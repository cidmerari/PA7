import java.util.Scanner;

public class areaCircunferencia{
public static void main(String[] args) {
  Scanner ingreso = new Scanner(System.in);
  double radio, area;
  double pi=3.1416;
  System.out.println("Area de la circunferencia");
  System.out.println("Ingresa el radio");
  radio = ingreso.nextInt();
   area = (radio *radio) * pi;
  System.out.println("el area de la circunferencia es:" + area);
}

}
