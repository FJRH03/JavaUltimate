package binarySearch;

import java.util.Scanner;

/*
    Binary Search class.
    Reference: https://www.youtube.com/watch?v=-isTl614INQ
    @author Francisco Ramirez
 */
public class BinarySearch {

    public static void main(String[] args) {

        //1 2 3 4 5 6 7 [8] 9 10 -> array number

        //0 1 2 3 4 5 6 [7] 8 9 -> position

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array:");

        int size = sc.nextInt();

        // Declare the array
        int [] array = new int[size];

        // Insert element into array
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter value for position " + i + " of the array: ");
            array[i] = sc.nextInt();
        }

        // Print array
        System.out.println("ARRAY CONTENT: ");
        for (int y = 0; y < array.length; y++){
            System.out.println("Array ["+y+"] = " + array[y]);
        }

        int search_num = 8;
        int inferior = 0;
        int center;
        int superior = size -1;

        // Binary Search
        while(inferior <= superior){

            center = (superior + inferior) / 2;

            if(array[center] == search_num){
                System.out.println("Search number is located in position: " + center);
                break; // once you found the number, exit loop.
            }
            else if (search_num < array[center]){
                superior = center -1;
            }
            else{
                inferior = center + 1;
            }
        }
   }
}