
import java.util.Scanner;

/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
 * de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 *
 * @author David Gonzalez/ Dudef-ui
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int extension, opcion;
        System.out.print("Dime que operacion quieres realizar(Suma = 1, Resta = 2, Multiplicacion = 3): ");
        opcion = teclado.nextInt();
        if (opcion > 0 && opcion <= 3) {
            //Se pide al usuario la extension de la matriz, como es cuadrada se usa el mismo valor para filas y columnas 
            System.out.print("Dime cuantas filas tiene la matriz: ");
            extension = teclado.nextInt();
            //Declaracion de las matrices 
            int matriz1[][] = new int[extension][extension];
            int matriz2[][] = new int[extension][extension];
            int matriz3[][] = new int[extension][extension];
            //Se pide al usuario llenar las matrices 
            for (int i = 0; i < (matriz1.length); i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    System.out.print("Dime los valores de la matriz 1: ");
                    matriz1[i][j] = teclado.nextInt();
                }
            }
            for (int i = 0; i < (matriz1.length); i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    System.out.print("Dime los valores de la matriz 2: ");
                    matriz2[i][j] = teclado.nextInt();
                }
            }
            suma_resta_multiplicacion(matriz1, matriz2, matriz3, opcion);
        }  
    }
    public static void suma_resta_multiplicacion(int matriz1[][], int matriz2[][], int matriz3[][], int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: ");
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1[0].length; j++) {
                        matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                        System.out.print("["+matriz3[i][j]+"]" + " ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("El resultado de la resta es: ");
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1[0].length; j++) {
                        matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
                        System.out.print("["+matriz3[i][j]+"]" + " ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1[0].length; j++) {
                        for (int k = 0; k < matriz1[0].length; k++) {
                            //Signo += ya que se va a sumar la multiplicacion de ambas matrices.
                            // matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                            matriz3[i][j] = matriz3[i][j] + (matriz1[i][k] * matriz2[k][j]);
                        }
                        System.out.print("["+matriz3[i][j]+"]" + " ");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
/***
 * Dime que operacion quieres realizar(Suma = 1, Resta = 2, Multiplicacion = 3): 3
 * Dime cuantas filas tiene la matriz: 2
 * Dime los valores de la matriz 1: 1
 * Dime los valores de la matriz 1: 2
 * Dime los valores de la matriz 1: 3
 * Dime los valores de la matriz 1: 4
 * Dime los valores de la matriz 2: 1
 * Dime los valores de la matriz 2: 2
 * Dime los valores de la matriz 2: 3
 * Dime los valores de la matriz 2: 4
 * [7] [10] 
 * [15] [22] 
 */