package ejercicio9;

import java.util.Scanner;

/*
    Ejercicio 8: Se desea calcular el factorial de un número que fue introducido por el teclado
    y mostrar el resultado en pantalla.

    @author America Alejandra Santos Sanchez
 */
public class Ejercicio8 {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int factorial = 1;
        System.out.println("Favor ingrese el número a calcular el factorial: ");
        int numero = teclado.nextInt();

        while(numero != 0){
            factorial = factorial * numero;
            numero = numero - 1;
        }
        System.out.println("El factorial del numero leido ingresado es: " + factorial);
    }
}