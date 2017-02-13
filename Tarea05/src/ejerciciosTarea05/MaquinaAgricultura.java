/**
 * Maquina Agricultura
 * Descripción: Define si encender o no una maquina rociadora
 * Fecha:10 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 10-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea05;

//Librerias

import java.io.*;

public class MaquinaAgricultura {

    public static void main(String[] args) throws IOException {//Inicia el programa
        //Variables
        int cultivo,tiempSie,temp,tiempCos;
        String clima;
        //Entrada y Salidas
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //Digitar la informacion
        imprimir.println("Digite el tipo de cultivo (1,2 o 3)");
        cultivo = Integer.parseInt(leer.readLine());
        imprimir.println("Digite el tiempo de siembra");
        tiempSie = Integer.parseInt(leer.readLine());
        imprimir.println("Digite la temperatura");
        temp = Integer.parseInt(leer.readLine());
        imprimir.println("Digite el tiempo de cosecha");
        tiempCos = Integer.parseInt(leer.readLine());
        imprimir.println("Digite el clima (seco, lluvioso...)");
        clima = leer.readLine();
        //codigo
        if((temp>5 && temp<30&&"no llueve".equals(clima))||
                ("seco".equals(clima)&&(cultivo==1||cultivo==2||cultivo==3))||
                (tiempSie*3<tiempCos&&cultivo!=4&&temp<23)){
            imprimir.println("Si se activa");
        }
        else{
            imprimir.println("No se activa");
        }
    }//Termina el programa
}