package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
    }
}