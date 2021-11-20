package ejercicio9;

import java.util.Scanner;

/*
    Ejercicio 3: Es un programa que pida número y los sume hasta que el usuario ingrese "-1"
    al final muestre la suma total.
 */
public class Ejercicio3 {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int suma = 0, num;
        do{
            System.out.println("Ingrese un numero: ");
            num = teclado.nextInt();
            if(num != -1){
                suma += num;
            }else{
                break;
            }
        }while(num != -1);
        System.out.println("La suma total de los numeros es de: " + suma);
    }
}