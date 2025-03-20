package DSA_Programming.Basic_Java_Programming;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a =sc.nextInt();
        System.out.println("Enter the second number: ");
        int b =sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of two number is: "+ sum);
        sc.close();
    }
}
