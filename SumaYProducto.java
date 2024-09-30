package Programas;
/*
Crear un programa en java que permita ingresar al usuario una serie de números. 
Al finalizar muestre la suma y el producto de esos números.
Introduce un numero: 8
Introduce un numero: 18
Introduce un numero: 28
Introduce un numero: 32
La suma de los numero es: 86
El producto de los números es: 129,024
*/
import java.util.Scanner;

public class SumaYProducto {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int suma = 0, producto = 1;
        String continuar;

        do {
            System.out.print("Introduce un número: ");
            int num = lectura.nextInt();
            suma += num;
            producto *= num;

            System.out.print("¿Quieres ingresar otro número? (s/n): ");
            continuar = lectura.next();
        } while (continuar.equals("s")|| continuar.equals("S") );

        System.out.println("La suma de los números es: " + suma);
        System.out.println("El producto de los números es: " + producto);
    }
}