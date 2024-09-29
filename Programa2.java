/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/*
 Crear un programa en Java que permita ingresar el nombre de los alumnos
 y sus tres notas de cada uno, preguntar al usuario si desea continuar registrando 
 datos. Visualizar el nombre del alumno  con el mayor promedio obtenido.

Ingrese el nombre del alumno: Antonio
Ingrese la primera nota : 19
Ingrese la segunda nota : 18
Ingrese la Tercera nota : 20
El promedio del alumno es: 19.0
�Desea continuar registrando datos? (S/N): s
Ingrese el nombre del alumno: Judith
Ingrese la primera nota : 14
Ingrese la segunda nota : 15
Ingrese la Tercera nota : 16
El promedio del alumno es: 15.0
�Desea continuar registrando datos? (S/N): s
Ingrese el nombre del alumno: Juan
Ingrese la primera nota : 18
Ingrese la segunda nota : 17
Ingrese la Tercera nota : 19
El promedio del alumno es: 18.0
�Desea continuar registrando datos? (S/N): n
El alumno con el mayor promedio es: Antonio
Mayor promedio obtenido: 19.0
 */
import java.util.Scanner;
public class Programa2 {
    public static void main(String[] args) {
       Scanner lectura = new Scanner(System.in);
 // declarar variables
 String namp = "";
 double mp = 0;
 String continuar,nombre;
 double nota1,nota2,nota3,promedio;
 
 // proceso
 do {
            System.out.print("Ingrese el nombre del alumno: ");
            nombre=lectura.next();
             System.out.print("Ingrese la primera nota : ");
             nota1=lectura.nextDouble();
             System.out.print("Ingrese la segunda nota : ");
             nota2=lectura.nextDouble();
             System.out.print("Ingrese la Tercera nota : ");
             nota3=lectura.nextDouble();
             // Calcular promedio del alumno actual
          promedio = (nota1 + nota2 + nota3) / 3;
          // Determinar si es el mayor promedio hasta ahora
            if (promedio > mp) {
                mp = promedio;
                namp = nombre;
            }   
            System.out.println("El promedio del alumno es: " + promedio);
             // Preguntar si desea continuar
            System.out.print("¿Desea continuar registrando datos? (S/N): ");
            continuar = lectura.next().toUpperCase();
            } while (continuar.equals("S"));

        // Mostrar el alumno con el mayor promedio
        if (!namp.isEmpty()) {
            System.out.println("El alumno con el mayor promedio es: " + namp);
            System.out.println("Mayor promedio obtenido: " + mp);
        } else {
            System.out.println("No se registraron alumnos.");
        }

        lectura.close();
        }
    }
 
    
