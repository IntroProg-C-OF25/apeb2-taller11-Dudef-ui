
import java.util.Scanner;

/**
 * Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional. 
 * El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal (quien es el único responsable de gestionar las entradas/salidas); 
 * además el método debe recibir como parámetro un arreglo bidimensional.
 * @author David Gonzalez/Dudef-ui
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lim_filas= 0,lim_columnas=0;
        System.out.print("Dime las filas y columnas de la matriz: ");
        lim_filas = teclado.nextInt();
        lim_columnas = teclado.nextInt();
        int matriz[][] = new int[lim_filas][lim_columnas];
        GenerarMatriz(matriz);
        System.out.println("Matriz generada");
        PresentarMatriz(matriz);
        System.out.println("Elementos:");
        par_impar(matriz);
        PromedioMatriz(matriz);
    }
    // Las matrices son varibales por referencia entonces se pueden imprimir como metodos 
    //Generar la matriz
    public static void GenerarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random()* 10);
            }
        }
    }
    //Metodo para presentar la matriz
    public static void PresentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    //Determinar elementos pares y impares
    public static void par_impar(int matriz[][]) {
        System.out.println("Elementos pares: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2==0) ? matriz[i][j]+(" "): "");
            }
            System.out.println("");
        }
        System.out.println("Elementos impares: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j]%2!=0) ? matriz[i][j]+(" "): "");
            }
            System.out.println("");
        }
    }
    public static void PromedioMatriz(int matriz[][]) {
        int sumaMatriz = 0, promedio = 0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               sumaMatriz += matriz[i][j];
            }
        }
        promedio = sumaMatriz/(matriz.length*matriz[0].length);
        System.out.println("Promedio matriz: " + promedio);
    }
} 
/***
 * run:
 * Dime las filas y columnas de la matriz: 2 2
 * Matriz generada
 * 8 4 
 * 9 8 
 * Elementos:
 * Elementos pares: 
 * 8 4 
 * 8 
 * Elementos impares: 
 * 9 
 * Promedio matriz: 7
 * BUILD SUCCESSFUL (total time: 3 seconds)
 */
    

