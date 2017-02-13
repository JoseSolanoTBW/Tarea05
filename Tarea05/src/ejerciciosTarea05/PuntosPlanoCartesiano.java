/**
 * Determinar la distancia segun dos puntos
 * Descripción: Dados 2 puntos en el plano cartesiano 
 * Fecha: 13-2-2017
 * Autor: Jose Solano Montoya
 * Fecha de modificación: 13-02-17
 * Modificado por: Jose Solano Montoya
 */

package ejerciciosTarea05;

import java.io.*;

public class PuntosPlanoCartesiano {
public static void main(String[] args) throws IOException
{//Inicia el programa
    double punX1, puntX2, punY1, puntY2, distX, distY, sumaDis, distTo;
    
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    PrintStream imprimir = System.out;
    imprimir.println("Digite el punto X1");
    punX1= Integer.parseInt(leer.readLine());
    imprimir.println("Digite el punto X2");
    puntX2= Integer.parseInt(leer.readLine());
    imprimir.println("Digite el punto Y1");
    punY1= Integer.parseInt(leer.readLine());
    imprimir.println("Digite el punto Y2");
    puntY2= Integer.parseInt(leer.readLine());
    
    distX= puntX2-punX1;
    distY=puntY2-punY1;
    
    distX= distX*distX;
    distY= distY*distY;
    
    sumaDis=distX+distY;
    distTo= Math.sqrt(sumaDis);
    
    imprimir.println("La distancia de un punto a otro es de: "+ distTo);
}//Fin Programa
}
