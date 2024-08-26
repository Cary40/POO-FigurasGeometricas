
package poo;
import java.util.Scanner;
public class FigurasGeometricas {
    public static void main(String[] args){
    
      while (true){
          System.out.println("Calcular Perimetro y Area");
          System.out.println("Opcion 1 : Cuadrado ");
          System.out.println("Opcion 2: Triangulo ");
          System.out.println("Opcion 3 : Rectangulo");
          System.out.println("Opcion 0: SALIR ");
          System.out.println("Ingrese 0, 1 , 2 o 3");
          Scanner sc=new Scanner(System.in);
          int opcion=sc.nextInt();
          if(opcion==0){
              System.out.println("Los calculos han finalizado");
              break;
          }
          switch(opcion){
              case 1: 
                  Cuadrado cuadrado1=new Cuadrado();
                  System.out.println("Ingrese un lado del cuadrado");
                  float lado=sc.nextFloat();
                  cuadrado1.setLado(lado);
                  System.out.println("El lado ingresado es:"+cuadrado1.getLado());
                  System.out.println("El perimetro es:"+cuadrado1.CalcularPerimetro()) ;
                  System.out.println("El area es:"+cuadrado1.CalcularArea()) ;
                  break;
              case 2:
                  System.out.println("Ingrese la base del triangulo");
                  float Base=sc.nextFloat();
                  System.out.println("Ingrese la altura del triangulo");
                  float Altura=sc.nextFloat();
                  Triangulo triangulo1=new Triangulo( Base, Altura);
                  System.out.println("El perimetro es:"+triangulo1.CalcularPerimetro()) ;
                  System.out.println("El area es:"+triangulo1.CalcularArea()) ;
                  break;
              case 3 :    
                  System.out.println("Ingrese un lado del rectangulo");
                  float lado1=sc.nextFloat();
                  System.out.println("Ingrese el otro lado del rectangulo");
                  float lado2=sc.nextFloat();
                  Rectangulo rectangulo1=new Rectangulo(lado1,lado2);
                  System.out.println("El perimetro es:"+rectangulo1.CalcularPerimetro()) ;
                  System.out.println("El area es:"+rectangulo1.CalcularArea()) ;
                  break;
              default:
                    System.out.println("Opción inválida. Intente nuevamente.");
          }
      }  
    }
    
}
 
