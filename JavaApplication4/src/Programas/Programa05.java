package Programas;
import java.util.Scanner;

public class Programa05 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Declarar variables
        double[] sueldos = new double[5];
        double totalSueldos = 0;
        double promedioSueldos;
        
        // Solicitar los sueldos de los empleados
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = input.nextDouble();
            totalSueldos += sueldos[i]; // Sumar cada sueldo al total
        }
        
        // Calcular el sueldo promedio
        promedioSueldos = totalSueldos / sueldos.length;
        
        // Mostrar los resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Total de sueldos: " + totalSueldos);
        System.out.println("Sueldo promedio: " + promedioSueldos);
        
        // Cerrar el objeto Scanner
        input.close();
    }
}
