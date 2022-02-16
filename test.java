import java.util.Scanner;

public class test {     
    static Scanner scanner = new Scanner(System.in);
    static test test = new test();

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

        System.out.print(input + " plus " + input2 + " equals ");
        System.out.println(Integer.parseInt(input) + Integer.parseInt(input2));
        // System.out.println(Integer.parseInt(input) + Integer.parseInt(input2));

        /*
        Alright, this is fucked up. Now when I add the strings printing the sum operations
        for ease of viewing, the parsing at the end doesn't work. WHY

        ok. I've been told that it's because you can't use more than one data type with the 
        + operator
        */

        restart();

    }

    public static void restart () {
        System.out.println("Restarting...");

        start();
    }

}

