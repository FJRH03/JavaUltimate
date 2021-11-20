package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

/*
    Ejercicio 1: Vas a pedir dos numeros dobles. Posteriormente mostrar un menu donde se muestren
    las siguientes opciones.

    a) Sumar
    b) Restar
    c) Multiplicar
    d) Dividir

    @author America Alejandra Santos Sanchez
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, resultado;
        String opcion;
        System.out.println("Por favor ingre el primer valor decimal: " );
        num1 = teclado.nextDouble();
        System.out.println("Ahora ingrese el segundo valor decimal: ");
        num2 = teclado.nextDouble();

        System.out.println("Los numeros ingresados fueron: " +num1+ " y " + num2);
        System.out.println("Ahora seleccione una de estas opciones: ");
        System.out.println("a) Sumar: \n" + "b) Restar: \n" + "c) Multiplicar \n" + "d) Dividir \n");
        System.out.println("");
        opcion = teclado.next();

        // Investigue que .toLowerCase() nos permite que no ocurra error al escribir mayusculas y minusculas
        switch (opcion.toLowerCase()){

            case "a":
                resultado = num1 + num2;
                System.out.println("La suma de los números es de: "+ resultado);
                break;

            case "b":
                resultado = num1 - num2;
                System.out.println("La resta de los numeros es de: " + resultado);
                break;

            case "c":
                resultado = num1 * num2;
                System.out.println("La multiplicacion de los numeros es: " + resultado);
                break;
            case "d":
                resultado = num1 / num2;
                System.out.println("La division de los numeros es de: " + resultado);

            default:
                System.out.println("Lo siento el valor ingresado no es ninguna opcion listada!");
                break;
        }
    }
}
