/**
 * Restaurante Familia
 * Descripción: Calcula la cuenta de una familia de 4 personas
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea05;

//Librerias

import java.io.*;
import static oracle.jrockit.jfr.events.Bits.intValue;

public class RestauranteFamilia {

    public static void main(String[] args) throws IOException {//Inicia el programa
        //Variables
        int familia=0;
        int opcion;
        int cuenta=0;

        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //Solicitar la informacion
        imprimir.println("Bienvenido al restaurante LA LAGUNA VERDE ¿que desea ordernar?(Digite el numero)");
        do {
            imprimir.println("1.Langosta al Ajillo");
            imprimir.println("2.Sopa de Marisco");
            imprimir.println("3.Filete de pescado");
            opcion = Integer.parseInt(leer.readLine());

            switch (opcion) {
                case 1:
                    cuenta += intValue(2500 - 2500 * 0.2);
                    familia += 1;
                    break;
                case 2:
                    cuenta += 1500;
                    familia += 1;
                    break;
                case 3:
                    cuenta += 1700;
                    familia += 1;
                    break;
                default:
                    imprimir.println("No digito la opcion correcta");
                    break;
            }
        } while (familia != 4);
        //Resultado
        imprimir.println("El total de la cuenta es: " + cuenta);
    }//Termina el programa
}