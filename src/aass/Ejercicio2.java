package aass;

/*
    2. Un programa que sume y muestre dicha suma de los numeros pares del 1 al 100
    @author America Alejandra Santos Sanchez
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int suma = 0; // variable para guardar la suma de los numeros impares
        int i = 1; // contador para iterar
        do{
            if(i%2!=0) { // validamos que sena impares
                suma +=i; // guardamos el numero impar en esta variable
            }
            i++; // incrementamos el iterador
        }while( i<=100); // condicion
        System.out.println("La suma total de los numeros pares de 1 a 100 es de: " + suma);
    }
}

