/**
 * Zoologico
 * Descripción: Cantidad de cc de vacuna para vacunar a un zoologico
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea05;

//Librerias

import java.io.*;


public class Zoologico {
    //Constantes
    public static final int VACUNA=5;
    public static void main(String[] args) throws IOException {//Inicia el programa
        //Variable
        int animales, jaulas,ccTotal;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;

        imprimir.println("Digite el numero de jaulas");
        jaulas = Integer.parseInt(leer.readLine());
        imprimir.println("Digite el numero de animales");
        animales = Integer.parseInt(leer.readLine());
        
        ccTotal=animales*jaulas*VACUNA;
        imprimir.println("La cantidad de cc de vacunas que se ocupa en total es: " + ccTotal+"cc");

    }//Termina el programa
}