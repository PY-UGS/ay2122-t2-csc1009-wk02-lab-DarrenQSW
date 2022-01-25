import java.util.Scanner;

public class Week2q1 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        double areaCircle = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + areaCircle);
        input.close(); 
    }
}