package Programas;

/**
 Crear un programa en java que permita ingresar al usuario una serie de números y al finalizar calcule la media.
Ejemplo:
Numero1: 8
Numero2: 16
Numero3: 24
Numero4: 32
Resultado:  20
 */
import java.util.Scanner;
public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int suma = 0, contador = 0;
        char continuar;
        double media =0;
        do {
            System.out.print("Introduce un numero: ");
            int num = lectura.nextInt();
            suma += num;
            contador++;
             System.out.print("¿Quieres ingresar otro numero? (s/n): ");
            continuar = lectura.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        
        media = (double) suma / contador;
        System.out.println("La media de los números ingresados es: " + media);
    }
}
        
    
    
