/**
 * Determinar el inverso de un numero
 * Descripción: Dado 1 numero poner dicho numero alrevez
 * Fecha: 13-2-2017
 * Autor: Jose Solano Montoya
 * Fecha de modificación: 13-02-17
 * Modificado por: Jose Solano Montoya
 */
package ejerciciosTarea05;

import java.io.*;

public class NumeroInverso {
    
    public static void main (String[] args) throws IOException
    {
        //Variables
        int i, num1,num2, numInver, cont=0, numD=10, suma=0,expon, multi=1;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        
        imprimir.println("Digite un numero");
        num1= Integer.parseInt(leer.readLine());
        imprimir.println("Su inverso es: ");
        num2=num1;
        while(num2!=0)
        {
            num2=num2/10;
            cont=cont+1;
        }
      
        while (cont!=0)
        {
            expon= cont;
            numInver=num1 %10;
            while(expon!=0)
            {
             multi= multi*10;    
            }
            suma=suma+(multi*numInver);
        }
        imprimir.println(suma);
        
    }
}
