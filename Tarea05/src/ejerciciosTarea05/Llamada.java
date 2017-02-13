/**
 * Nombre del programa
 * Descripción: 
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea05;

//Librerias

import java.io.*;

public class Llamada {

    public static void main(String[] args) throws IOException {//Inicia el programa
        //variables
        int callCost,costMin,minuA;
        char userClass;
        //Entrada y Salidas
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //ingreso de informacion
        imprimir.println("Digite el tipo de clase de la llamada (a o b)");
        userClass = leer.readLine().charAt(0);
        imprimir.println("Digite la cantidad de minutos de la llamada");
        costMin = Integer.parseInt(leer.readLine());

        //calculo
        if (userClass == 'a') {
            if (costMin <= 3) {
                callCost = 300;
            } else {
                minuA = costMin - 3;
                callCost = (minuA * 150) + 300;
            }
        } else {
            callCost = costMin * 400;
        }
        
        imprimir.println("El costo de la llamada es de:" + callCost);

    }//Termina el programa
}