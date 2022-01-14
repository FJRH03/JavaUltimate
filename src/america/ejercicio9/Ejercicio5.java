package america.ejercicio9;

import java.util.Scanner;

/*  Ejercicio 5: Un programa que pida un número X y posteriomente pida X cantidad de números
    e irlos sumando, al final mostrar la suma total de los números.

    @author America Alejandra Santos Sanchez
 */

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0; // aqui guardamos la suma de los numeros ingresados por el usuario
        int n = 0; // esta variable nos dira el numero de veces a sumar los numeros
        int i = 0;
        System.out.println("Ingrese numero de contador de veces a sumar: ");
        n = teclado.nextInt(); // Aqui leemos el numero de veces a contar
        do {
            System.out.println("Ingresa un numero entero: "); // pedimos los numeros al 3usuario
            suma += teclado.nextInt(); // Aqui ingresamos los numeros a sumar
            i++;
        }while(i < n);
        System.out.println("La suma total es de: " + suma);
    }
}