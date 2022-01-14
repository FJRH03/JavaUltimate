package sequentialSearch;

import java.util.Scanner;

public class SequentialSearch {

    public static void main(String[] args) {

        //0 0 0 0 0 0 0 0 0 0

        //0 1 2 3 4 5 6 7 8 9

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

        // Sequential Search
        int search_number = 5;
        for (int e = 0; e < array.length; e++){
            if(array[e] == search_number){
                System.out.println("Search number requested is on a position: " + e);
            }
        }

    }
}