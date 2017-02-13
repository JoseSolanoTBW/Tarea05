/**
 * Calculadora Postfija
 * Descripción: Recibe los operando y la operacion y hace le calculo
 * Fecha:10 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 10-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea05;

//Librerias
import java.io.*;

public class CalculadoraPostfija {

    public static void main(String[] args) throws IOException {//Inicia el programa
        int num1, num2, result = 0;
        char operacion;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //peticion de los numeros
        imprimir.println("Digite el primer numero");
        num1 = Integer.parseInt(leer.readLine());

        imprimir.println("Digite el segundo  numero");
        num2 = Integer.parseInt(leer.readLine());
        //En caso de error volver a preguntar por el signo
        do {
            imprimir.println("Digite la operacion a realizar (+,-,/,*)");
            operacion = leer.readLine().charAt(0);
            //Selecciona operacion
            switch (operacion) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                default:
                    imprimir.println("La operacion digitada no es valida");
                    break;
            }
        } while (operacion != '+' && operacion != '-' && operacion != '/' && operacion != '*');
        //Resultado
        imprimir.println("El resultado es: " + result);

    }//Termina el programa
}
