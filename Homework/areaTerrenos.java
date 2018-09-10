import java.util.Scanner;

public class areaTerrenos{
public static void main(String[] args) {
  Scanner ingreso = new Scanner(System.in);
  double base,altura, area1,base2,altura2,area2,areatotal;
  System.out.println("Area del triangulo");
  System.out.println("Ingresa la base del triangulo");
  base = ingreso.nextInt();
   System.out.println("ingresa la altura del triangulo");
  altura = ingreso.nextInt();
  area1 =(base*altura)/2;
  System.out.println("el area del triangulo es:" + area1);

  System.out.println("Area del rectangulo");
  System.out.println("Ingresa la base del rectangulo");
  base2 = ingreso.nextInt();
   System.out.println("ingresa la altura del rectangulo");
  altura2 = ingreso.nextInt();
  area2 = base2*altura2;
  System.out.println("el area del rectangulo es:" + area2);
  areatotal= area1+area2;
  System.out.println("el area total del terreno es :"+areatotal);





}

}
