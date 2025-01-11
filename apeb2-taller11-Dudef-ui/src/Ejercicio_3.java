
import java.util.Scanner;

/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el
 * promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el
 * promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el
 * promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la función
 * se la debe llamar desde un método principal. Los parámetros necesarios para
 * llamar a la función, deben ser ingresados solicitados al usuario.
 *
 * @author David Gonzalez/ Dudef-ui
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numeros[] = new double[4];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime el numero: " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }
        promedio(numeros);
        clasificacion(0);
    }
    // Metodo para calcular promedio 
    public static void promedio(double numeros[]) {
        double prom = 0;
        for (int i = 0; i < numeros.length; i++) {
            prom += numeros[i];
        }
        prom = prom / numeros.length;
        System.out.println("El promedio es: " + prom);
    }
    //Metodo para encontrar el promedio (Pude ocupar un solo metodo)
    public static void clasificacion(double prom) {
        if (prom >= 0 && prom <= 5) {
            System.out.println("El promedio es regular ");
        } else if (prom >= 5.1 && prom <= 9) {
            System.out.println("El promedio es muy bueno");
        } else if (prom >= 9.1 && prom <= 10) {
            System.out.println("El promedio es sobresaliente");
        } else {
            System.out.println("Valor invalido ");
        }
    }
}

/***
 * run:
 * Dime el numero1: 
 * 6
 * Dime el numero2: 
 * 9
 * Dime el numero3: 
 * 3
 * Dime el numero4: 
 * 8
 * El promedio es: 6.5
 * El promedio es regular 
 * BUILD SUCCESSFUL (total time: 9 seconds)
 */