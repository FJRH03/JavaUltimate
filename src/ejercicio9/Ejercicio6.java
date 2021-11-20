package ejercicio9;

import java.util.Scanner;

/*
    Ejercicio 6: Un programa que pida 10 números enteros, cuenta la cantidad de números pares
    e impare y muestre el dichas cantidades (el número cero lo consideramos como par)

    @author America Alejandra Santos Sanchez
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        // creamos las variable
        Scanner teclado = new Scanner(System.in);
        int contadorPares = 0, contadorImpares = 0, n = 0, i = 0;
        final int CONTADOR = 10;

        do {
            System.out.println("Ingrese un número entero por favor: ");
            n = teclado.nextInt();
            if(n % 2 == 0 || n == 0){ // si el número es par o cero agregamos a la suma
                contadorPares += 1;
                i++;
            }else {
                contadorImpares += 1; // si el numero es impar agregamos a la suma de impares
                i++;
            }
        } while (i < CONTADOR); // Mientras y sea menor que 10 - recordando que contador comienza en 0 al 9 (10 veces)

        // Imprimimos en pantalla ambas sumatorias
        System.out.println("La suma total de los numeros pares es de: " + contadorPares);
        System.out.println("La suma total de los numeros impares es de: " + contadorImpares);
        System.out.println("i: " + i);
    }
}