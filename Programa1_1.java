
package Programas;

/**
 Crear un programa en java que permita ingresar l aedad, 
 * sexo de las personas y preguntar al usuario si desea continuar
 * o finalizar con el procesode registrp de datos.
 * Visualizar la cantidad de personas y promedio de edad , y la cantidad 
 * de personas de sexo masculino y femenino.
 * 
 * Ejemplo:
nro edad    sexo    opción
1   20       m       s
2   30       m       s
3   24       f       s
4   28       f       n

Resultados:
nro personas=4
cpsm=2
cpsf=2
pe=25.5
 */
import java.util.Scanner;
public class Programa1_1 {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // declarar variables
        int edad,cpsm,cpsf,cp;
        String opc="", sexo="";
        double pe,se;
        boolean estado=true;
         //Proceso
         cpsm=0;
         cpsf=0;
         cp=0;
         se=0;
        
         do{
                System.out.print("Ingrese su edad : ");
                edad= lectura.nextInt();
                System.out.print("Ingrese Sexo  (M/F) :  ");
                sexo= lectura.next();
                cp++; //contador
                se+=edad; // acumulador
                if (sexo.equals("m")) {
                    cpsm++; //contador de Masculino
              }  else    {
                    cpsf++ ;// contador de Femenino
              }
         do{ 
                System.out.print("¿Desea continuar  (si/no) :  ");
                opc= lectura.next();
                if (opc.equals("si") || opc.equals("no")) {
                 estado=false;
             } else {
                    estado=true;
                    System.out.println("Solo se debe ingresar si o no");
                }
              }while  (estado);
        } while (opc.equals("si"));
         pe=se/cp;
         //Salida
         System.out.println("Cantidad de personas : "+cp);
         System.out.println("Cantidad de personas  de sexo masculino: "+cpsm);
        System.out.println("Cantidad de personas de sexo Femenino: "+cpsf);
        System.out.println("Promedio de Edad  de personas : "+pe);
     }  
}

