package Programas;

import java.util.Scanner;

public class Programa06 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Declarar variables
        String nombreEmpleado, cargo;
        double ingresos, gastos, ahorroMensual, ahorroBimestral, ahorroSemestral, ahorroAnual;
        
        // Solicitar datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = input.nextLine();
        
        System.out.print("Ingrese el cargo del empleado: ");
        cargo = input.nextLine();
        
        System.out.print("Ingrese los ingresos mensuales del empleado: ");
        ingresos = input.nextDouble();
        
        System.out.print("Ingrese los gastos mensuales del empleado: ");
        gastos = input.nextDouble();
        
        // Calcular el ahorro
        ahorroMensual = ingresos - gastos;
        ahorroBimestral = ahorroMensual * 2;
        ahorroSemestral = ahorroMensual * 6;
        ahorroAnual = ahorroMensual * 12;
        
        // Mostrar los resultados
        System.out.println("\n--- Resumen del Ahorro ---");
        System.out.println("Empleado: " + nombreEmpleado);
        System.out.println("Cargo: " + cargo);
        System.out.println("Ahorro mensual: " + ahorroMensual);
        System.out.println("Ahorro bimestral: " + ahorroBimestral);
        System.out.println("Ahorro semestral: " + ahorroSemestral);
        System.out.println("Ahorro anual: " + ahorroAnual);
        
        // Cerrar el objeto Scanner
        input.close();
    }
}