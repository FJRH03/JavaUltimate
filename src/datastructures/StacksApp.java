/**
 * Stack = LIFO data structure- Last-In First-Out
 * Stores objects into a sort of "vertical tower"
 * push() to add to the top
 * pop() to remove from the top
 */

package datastructures;

import java.util.Stack;

public class StacksApp {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        //System.out.println(stack.empty()); -- stack is empty?

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Returnal");
        stack.push("FFVII");
        System.out.println(stack);

        String myFavGame = stack.pop();
        System.out.println("My favorite Game is: " + myFavGame);

         //Remove Returnal from stack
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("Doom"));

        /**
         * Uses of stacks?
         * 1. Undo / redo features in text editors
         * 2. moving back/forward through browser history
         * 3. backtracking algorithms (maze, file directories)
         * 4. calling functions (call stack)
         */

    }
}