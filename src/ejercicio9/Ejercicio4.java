package ejercicio9;

import java.util.Scanner;

/*
    4. Un programa que pida 10 números, que se sume solamente los números
    pares y muestre dicha suma al final.

    @author America Alejandra Santos Sanchez
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int i = 0; // necesitamos esto para llevar el contador
        int suma = 0; // variable para guardar la suma de los numeros pares
        int n = 0; // variable que necesitamos recibir para poder validar si es par o no
        Scanner teclado = new Scanner(System.in);

        while(i < 10)
        {
            System.out.println("Ingrese un número entero: ");
            n = teclado.nextInt();
            if(n % 2 == 0){
                suma += n;
            }
            i++;
        }
        System.out.println("La suma total de los números pares es de: " + suma);
    }
}