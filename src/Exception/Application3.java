package Exception;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number;
        try {
            number = input.nextInt();
            System.out.println("number is " + number);
        }
        catch (Exception e) {
            System.out.println("You entered a wrong input");
        }
    }
}
