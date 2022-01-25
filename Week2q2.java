import java.util.Scanner;

public class Week2q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float no1 = input.nextFloat();
        float no2 = input.nextFloat();
        float no3 = input.nextFloat();
        float average = (no1 + no2 + no3)/3;
        System.out.println("The average of " + no1 + " " + no2 + " " + no3 + " is " + average);
        input.close();
    }
}
