package Exception;

import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = sc.nextInt();
        try {
            if (x < 0) {
                throw new MinusException();
            }
            else {
                System.out.println("x is " + x);
            }
        }
        catch (MinusException e) {
            System.out.println("You entered a negative number");
        }
    }
}

class MinusException extends Exception {



}
