import java.util.Scanner;
/*
Numero1: 15
Numero2: 19
Numero3: 75
Numero4: 88
Numero5: 92
Resultado:  
Cantidad de números primos = 

*/
public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int num,contadorPrimos = 0;
        char continuar;

        do {
            System.out.print("Introduce un número: ");
            num = lectura.nextInt();

            if (esPrimo(num)) {
                contadorPrimos++;
            }

            System.out.print("¿Quieres ingresar otro número? (s/n): ");
            continuar = lectura.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("Se ingresaron " + contadorPrimos + " números primos.");
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}