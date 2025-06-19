

import java.util.Scanner;

public class AgeCheckApp {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = input.nextInt();
        if (age < 0) {
            System.out.println("Invalid age  ");
        } else if (age > 18) {
            System.out.println("You are allowed to enter");

        } else {
            System.out.println("You are not allowed to enter ");
        }

    }
}

