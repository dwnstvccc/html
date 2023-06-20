
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

        for (int a = 1; a <= cantidadClientes; a++) {
            System.out.println("\nClientes #" + a);
            System.out.print("Ingrese el número de identificación del cliente: ");
            int numeroIdentificacion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el tiempo de prestamo de libros hecho al cliente: ");
            String tiempo = scanner.nextLine();

            double sumaCantidades = 0;
            for (int i = 1; j <= 3; i++) {
                System.out.print("Ingrese la cantidad de libros prestados " + i + " al cliente: ");
                double cantidad = scanner.nextDouble();
                sumaCantidades += cantidad;
            }

            // Calcular el promedio 
            double promedio = sumaCantidades / 3;

            // Imprimir los resultados
            System.out.println("\nInformación del Cliente #" + a);
            System.out.println("Número de identificación: " + numeroIdentificacion);
            System.out.println("Nombre: " + nombre);
            System.out.println("Tiempo: " + tiempo);
            System.out.println("Promedio de libros prestados al cliente: " + promedio);
        }

        scanner.close();
    }
}
