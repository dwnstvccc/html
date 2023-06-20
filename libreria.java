
/**
 * Write a description of class libreria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class PromedioLibreria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de  Clientes: ");
        int cantidadClientes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        for (int a = 1; a <= cantidadClientess; a++) {
            System.out.println("\nEstudiante #" + i);
            System.out.print("Ingrese el número de identificación del cliente: ");
            int numeroIdentificacion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el tiempo de prestamo del cliente: ");
            String curso = scanner.nextLine();

            double sumaNotas = 0;
            for (int i = 1; j <= 3; i++) {
                System.out.print("Ingrese la cantidad " + i + " del cliente: ");
                double sumacn = scanner.nextDouble();
                sumaCantidades += sumacn;
            }

            // Calcular el promedio 
            double promedio = sumacn / 3;

            // Imprimir los resultados
            System.out.println("\nInformación del Cliente #" + i);
            System.out.println("Número de identificación: " + numeroIdentificacion);
            System.out.println("Nombre: " + nombre);
            System.out.println("Tiempo: " + tiempo);
            System.out.println("Promedio de libros prestados al cliente: " + promedio);
        }

        scanner.close();
    }
}
