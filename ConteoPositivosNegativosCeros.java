package Programas;

/**
 2.	Crear un programa en java que permita ingresar al usuario una serie de números positivos, negativos y cero. Al finalizar cuenta cuántos números positivos, negativos y ceros han sido ingresados.
Ejemplo:
Numero1: 8
Numero2: -16
Numero3: 24
Numero4: -32
Numero5: 0
Resultado:  
Cantidad de números positivos = 2
Cantidad de números negativos = 2
Cantidad de números cero = 1
 */
import java.util.Scanner;
public class ConteoPositivosNegativosCeros {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;
        String continuar;
        int num;

        do {
            System.out.print("Introduce un número: ");
            num = lectura.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }

            System.out.print("¿Quieres ingresar otro número? (s/n): ");
            continuar = lectura.next();
        } while (continuar.equals("s")|| continuar.equals("S") );

        System.out.println("Cantidad de numeros Positivos: " + positivos);
        System.out.println("Cantidad de numeros Negativos: " + negativos);
        System.out.println("Cantidad de numeros Ceros: " + ceros);
    }
}
