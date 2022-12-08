import java.util.Scanner;

public class CircleDrawer {
    public static void main(String[] args) {
        // Ask the user for the radius of the circle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();

        // Calculate the diameter of the circle
        int diameter = radius * 2;

        // Loop through each row of the circle
        for (int y = -radius; y <= radius; y++) {
            // Loop through each column of the circle
            for (int x = -radius; x <= radius; x++) {
                // Calculate the distance of the current position from the center of the circle
                double distance = Math.sqrt(x * x + y * y);

                // If the distance is less than or equal to the radius,
                // draw an asterisk to represent the circle
                if (distance <= radius) {
                    System.out.print("*");
                } else {
                    // Otherwise, draw a space
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row is complete
            System.out.println();
        }
    }
}
