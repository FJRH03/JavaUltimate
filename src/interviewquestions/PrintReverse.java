/*
    @author Francisco Javier Ramirez Hernandez
    File: PrintReverse
    Date: 12/16/21
 */
package interviewquestions;

public class PrintReverse {

    public static void main(String[] args) {
        String myString = "Cocodrile";
        String reversedString = "";

        for (int i = myString.length()-1; i >= 0; i--){
            reversedString = reversedString + myString.charAt(i);
        }

        System.out.println("Original String: " + myString);
        System.out.println("Reversed String: " + reversedString);
    }
}