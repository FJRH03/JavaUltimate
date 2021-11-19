package aass;

import java.util.Scanner;

/*
    Ejercicio 7: De un total de 30 empleados calcular, cuantos ganan mas de 300, cuantos mas de 200 pero menos de
    300 y cuantos menos de 200. Mostrar los resultados por pantalla, mandando un mesanje que indique cuantos están dentro
    de cada rango.

    @author America Alejandra Santos Sanchez
 */
public class Ejercicio7 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int contador = 0, c1 = 0, c2 = 0, c3 = 0;
        double salario;

        while(contador < 30){
            System.out.println("Ingrese el salario de los 30 empleados en un rango de 0 a +300: ");
            salario = teclado.nextDouble();
            if(salario >= 300){
                c1 = c1 + 1;
                contador++;
            }else if (salario >= 200 && salario < 3200){
                c2 = c2 + 1;
                contador++;
            }else if (salario > 0 && salario < 200){
                c3 = c3 + 1;
                contador++;
            }else {
                System.out.println("El salario está fuera de rango. (0 a más de 300");
                continue;
            }
        }
        System.out.println("El total de empleados que ganan 300 ó más es de: " + c1);
        System.out.println("El total de empleados que ganan mas de 200 pero menos de 300 es de: " + c2);
        System.out.println("El total de empleados que ganan menos de 200 es de: " + c3);
    }
}