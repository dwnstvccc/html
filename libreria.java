
/**
 * Write a description of class libreria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class libreria
{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa para determinar el promedio de prestamos hechos en una libreria");
        System.out.println("");
        System.out.println("Ingrese la identificacion del cliente:");
        int id =  scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el tiempo de prestamo del cliente:");
        int tiempo = scanner.nextInt();
        scanner.nextLine();
        System.out.println ("Ingrese las tres cantidades de prestamos de libros hechas al cliente");
        System.out.print("cantidad uno:");
        double cantidad1 = scanner.nextDouble();
        System.out.print("cantidad dos:");
        double cantidad2 = scanner.nextDouble();
        System.out.print("cantidad tres:");
        double cantidad3 = scanner.nextDouble();
        
        double promedio = (cantidad1 + cantidad2 + cantidad3)/3;
        
        System.out.println("Informacion del cliente");
        System.out.println("numero de identificacion:" + id);
        System.out.println("nombre:" + nombre);
        System.out.println("tiempo de prestamo:" + tiempo);
        System.out.println("promedio de libros prestados:" + promedio);
        
        scanner.close();
        
        
    }

}
