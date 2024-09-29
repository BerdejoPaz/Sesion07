package Programas;

/**
 Crear un programa en java que permita ingresar l aedad, 
 * sexo de las personas y preguntar al usuario si desea continuar
 * o finalizar con el procesode registrp de datos.
 * Visualizar la cantidad de personas y promedio de edad , y la cantidad 
 * de personas de sexo masculino y femenino.
 */
import java.util.Scanner;
public class Programa1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int cantidadPersonas = 0;
        int sumaEdades = 0;
        int cantidadMasculino = 0;
        int cantidadFemenino = 0;
        String continuar;

        do {
            System.out.print("Ingrese la edad: ");
            int edad = lectura.nextInt();

            System.out.print("Ingrese el sexo (M/F): ");
            char sexo = lectura.next().toUpperCase().charAt(0);

            // Validación de entrada de sexo
            while (sexo != 'M' && sexo != 'F') {
                System.out.print("Sexo inválido. Ingrese el sexo nuevamente (M/F): ");
                sexo = lectura.next().toUpperCase().charAt(0);
            }

            // Actualización de contadores
            cantidadPersonas++;
            sumaEdades += edad;

            if (sexo == 'M') {
                cantidadMasculino++;
            } else if (sexo == 'F') {
                cantidadFemenino++;
            }

            // Preguntar si desea continuar
            System.out.print("¿Desea continuar ingresando datos? (S/N): ");
            continuar = lectura.next().toUpperCase();

        } while (continuar.equals("S"));

        // Cálculo del promedio de edades
        double promedioEdades = (cantidadPersonas > 0) ? (double) sumaEdades / cantidadPersonas : 0;

        // Mostrar resultados
        System.out.println("Cantidad de personas registradas: " + cantidadPersonas);
        System.out.println("Promedio de edad: " + promedioEdades);
        System.out.println("Cantidad de personas masculinas: " + cantidadMasculino);
        System.out.println("Cantidad de personas femeninas: " + cantidadFemenino);

        lectura.close();
    }
    
}
