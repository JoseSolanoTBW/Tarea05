/**
 * Monedas
 * Descripción: Calcula cuantas monedas se ocupa para cierta cantidad
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea05;

//Librerias

import java.io.*;

public class Monedas {

    public static void main(String[] args) throws IOException {//Inicia el programa
        int monto,mon50,mon20,mon10,mon5;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        
        imprimir.println("Digite un monto en colones");
        monto= Integer.parseInt(leer.readLine());
        if(monto%5 ==0){
        mon50=monto/50;
        monto-=mon50*50;
        
        mon20=monto/20;
        monto-=mon20*20;
        
        mon10=monto/10;
        monto-=mon10*10;
        
        mon5=monto/5;
        monto-=mon5*5;
        
        imprimir.println("Monedas de 50: "+mon50+" Monedas de 20: "+mon20+" Monedas de 10: "+mon10+"Monedas de 5: "+mon5);
        }
        else{
        imprimir.println("Digito un numero que no se puede dar en monedas");
        }
        
     

    }//Termina el programa
}