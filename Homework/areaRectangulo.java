import java.util.Scanner;

public class areaRectangulo{
public static void main(String[] args) {
  Scanner ingreso = new Scanner(System.in);
  int base, altura, area;
  System.out.println("Area del rectangulo");
  System.out.println("Ingresa la base");
  base = ingreso.nextInt();
  System.out.println("Ingresa la altura");
  altura = ingreso.nextInt();

   area = base * altura;
  System.out.println("el area del rectangulo es:" + area);
}

}
