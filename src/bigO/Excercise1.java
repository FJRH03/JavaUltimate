package bigO;
/*
    Big O - Cracking the coding interview book
    Example #1 (Page 46)
    @author Francisco Ramirez
 */
public class Excercise1 {

    public static void main(String[] args) {
        int [] intArray = new int[] {1,2,3,4,5};
        foo(intArray);
    }

    static void foo(int [] array)
    {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        for(int j = 0; j < array.length; j++){
            product *= array[j];
        }
        System.out.println(sum + ", " + product);
    }
}