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

public class RadioEsfera {

    public static void main(String[] args) throws IOException {//Inicia el programa
        //Variables
        double volumen,radio;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        
        //Solicitud de valores
        imprimir.println("Digite el radio de la esfera");
        radio = Double.parseDouble(leer.readLine());
        //Calculo
        volumen=4/3*Math.PI*Math.pow(radio,3);
        //Resultado
        imprimir.println("el volumen de la esfera es: "+ volumen);

    }//Termina el programa
}