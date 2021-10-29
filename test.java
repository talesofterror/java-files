import java.util.Scanner;

public class test {     
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        start();
    
    }

    public static void start() {

        System.out.println("Welcome to Advanced Sum Solver (A.S.S.) v0.01");
        
        
        System.out.println("Enter first integer");
        var input = scanner.next();
        System.out.println("Enter second integer");
        var input2 = scanner.next();
        scanner.reset();
        // scanner.close(); using this throws an error: Exception in thread "main" java.lang.IllegalStateException: Scanner closed

        /*
        This may be due to me defining scanner as Scanner(System.in). Maybe if I create
        an object containing a new System.in stream each time the program runs the error will
        go away???
        */

        System.out.println(input + " + " + input2 + " = " + Integer.parseInt(input) + Integer.parseInt(input2));

        restart();

    }

    public static void restart () {
        System.out.println("Restarting...");

        start();
    }

}

