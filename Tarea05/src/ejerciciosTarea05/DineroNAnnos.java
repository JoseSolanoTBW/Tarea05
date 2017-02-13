/**
 * DineroNAnnos
 * Descripción: Calcula el dineto que tiene una persona despues de n años
 * Fecha:10 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 10-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea05;

//Librerias
import java.io.*;

import static oracle.jrockit.jfr.events.Bits.intValue;

public class DineroNAnnos {

    public static void main(String[] args) throws IOException {//Inicia el programa
        //variables
        int montoIni, anno;
        double interes;
        int dinero;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //Codigo de realizacion del calculo
        //Solicitar informacion Necesaria
        imprimir.println("Digite el monto inicial de ahorro");
        montoIni = Integer.parseInt(leer.readLine());

        imprimir.println("Digite la tasa de interes");
        interes = Double.parseDouble(leer.readLine());
        interes = interes / 100;

        imprimir.println("Digite la cantidad de años que lleva ahorando");
        anno = Integer.parseInt(leer.readLine());

        //Calculos
        dinero = intValue(montoIni * Math.pow(1 + interes, anno));

        //Resultado
        imprimir.println("Su dinero ahorrado es " + dinero);

    }//Termina el programa
}
