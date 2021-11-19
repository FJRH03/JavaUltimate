package breakStatement;

public class BreakAndContinueApp {

    public static void main(String[] args) {

        for(int i=0; i<=10; i++){
            System.out.println("- Aún estás en el ciclo -");
            if(i == 4 )
            {
//                break;
                continue;
            }
            System.out.println("El valor de i es: " + i);
        }
        System.out.println("_ Saliste del ciclo _");
    }
}
