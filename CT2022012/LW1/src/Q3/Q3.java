package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First name: ");
        String first = sc.nextLine();

        System.out.print("Middle name: ");
        String middle = sc.nextLine();

        System.out.print("Last name: ");
        String last = sc.nextLine();

        System.out.println(first + " " + middle.charAt(0) + ". " + last);
    }
}