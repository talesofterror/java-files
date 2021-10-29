import java.io.Console;
import java.util.Scanner;

public class test {     
    public static void main(String[] args) {

        start();

    }

    public static void start() {

        System.out.println("hello world");

        Scanner scanner = new Scanner(System.in);
        var input = scanner.next();
        var input2 = scanner.next();

        System.out.println(Integer.parseInt(input) + Integer.parseInt(input2));

        scanner.close();

        restart();

    }

    public static void restart () {
        System.out.println("Restarting");
        start();
    }

}

