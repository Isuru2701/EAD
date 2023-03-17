package Exception;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        //take an input from user using scanner and throw Positive Exception if the number is positive
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        try {
            if (num > 0) {
                throw new PositiveException();
            }
        } catch (PositiveException e) {
            System.out.println(e.getMessage());
        }

    }
}

class PositiveException extends Exception {
    public PositiveException() {
        super("The number is positive");
    }
}
