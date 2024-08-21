package Programas;
import java.util.Scanner;

public class Programa04 {

  public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input=new Scanner(System.in);
        
        // Declarar variables
        String nombreCliente, producto;
        double precio, subtotal, igv, total;
        int cantidad;
        final double IGV_RATE = 0.18; // Tasa del IGV (18%)
        
        // Solicitar datos del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = input.nextLine();
        
        // Solicitar datos del producto
        System.out.print("Ingrese el nombre del producto: ");
        producto = input.nextLine();
        
        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        
        System.out.print("Ingrese la cantidad del producto: ");
        cantidad = input.nextInt();
        // Calcular subtotal, IGV y total
        subtotal = precio * cantidad;
        igv = subtotal * IGV_RATE;
        total = subtotal + igv;
        
        // Mostrar los resultados
      
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV (18%): " + igv);
        System.out.println("Total a pagar: " + total);
        
        // Cerrar el objeto Scanner
        input.close();
    }
}
