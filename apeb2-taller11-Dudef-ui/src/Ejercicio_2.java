
import java.util.Scanner;

/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, 
 * área de un triángulo y área de un rectángulo. Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente. 
 * Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 
 * 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 * @author David Gonzalez/Dudef-ui
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado=0, base= 0,altura=0 ;
        int seleccion = 0;
        System.out.println("Dime que area quieres calcular?(cuadrado = 1, triangulo = 2, rectangulo = 3)");
        seleccion = teclado.nextInt();
        if(seleccion == 1){
            System.out.println("Dime un lado del cuadrado: ");
            lado = teclado.nextDouble();
            System.out.println("El area del cuadrado es: " + Area_cuadrado(lado));
        }else if(seleccion == 2){
            System.out.println("Dime la base del triangulo: ");
            base = teclado.nextDouble();
            System.out.println("Dime la altura del triangulo: ");
            altura = teclado.nextDouble();
            System.out.print("El area del triangulo es: " + Area_triangulo(base, altura));
        }else if(seleccion == 3){
            System.out.println("Dime la base del rectangulo: ");
            base = teclado.nextDouble();
            System.out.println("Dime la altura del rectangulo: ");
            altura = teclado.nextDouble();
            System.out.println("El area del rectangulo es: " + Area_rectangulo(base, altura));
        }
        
    }
    //Funciones para las areas
    public static double Area_cuadrado(double lado){
        return lado * lado;
    }
    public static double Area_triangulo(double base,  double altura){
        return (base * altura)/2;
    }
    public static double Area_rectangulo(double base,  double altura){
        return (base * altura);
    }
}
/*** 
 * run:
 * Dime que area quieres calcular?(cuadrado = 1, triangulo = 2, rectangulo = 3)
 * 1
 * Dime un lado del cuadrado: 
 * 4
 * El area del cuadrado es: 16.0
 * BUILD SUCCESSFUL (total time: 7 seconds)
 */