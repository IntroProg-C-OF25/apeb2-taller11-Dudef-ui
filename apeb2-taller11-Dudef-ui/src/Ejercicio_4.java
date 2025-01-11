
import java.util.Scanner;

/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. 
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * @author David Gonzalez/Dudef-ui
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad_kilowatio, cedula, proceso;
        double precio_kilowatio, valor_inmueble;
        String nombre;
        System.out.print("Dime tu nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Dime tu numero de cedula: ");
        cedula = teclado.nextInt();
        System.out.print("Dime que proceso quieres realizar(1=Planilla de luz, 2 = Predio):");
        proceso = teclado.nextInt();
        if (proceso==1){
            System.out.print("Dime la cantidad de kilowatios: ");
            cantidad_kilowatio = teclado.nextInt();
            System.out.print("Dime el precio por kilowatio: ");
            precio_kilowatio = teclado.nextDouble();
            System.out.print("Cliente: " + nombre+" con cedula "+ cedula + " debe cancelar " + calcularValorLuz(cantidad_kilowatio, precio_kilowatio));
        }else if(proceso==2){
            System.out.print("Dime el precio del inmueble: ");
            valor_inmueble = teclado.nextDouble();
            System.out.print("Cliente: " + nombre+" con cedula "+ cedula +" con un inmueble de  valor "+valor_inmueble+" debe cancelar " + calcularPredio(valor_inmueble) );
        }System.out.println("");
    }
    public static double calcularValorLuz(int cantidad_kilowatio, double precio_kilowatio) {
        return cantidad_kilowatio * precio_kilowatio;
    }
    public static double calcularPredio(double valor_inmueble){
        return valor_inmueble*0.02;
    }
}
/***
 * run:
 * Dime tu nombre: David Gonzalez
 * Dime tu numero de cedula: 1234342312
 * Dime que proceso quieres realizar(1=Planilla de luz, 2 = Predio): 2
 * Dime el precio del inmueble: 30000
 * Cliente: David Gonzalez con cedula 1234342312 con un inmueble de  valor 30000.0 debe cancelar 600.0
 * BUILD SUCCESSFUL (total time: 24 seconds)
 */