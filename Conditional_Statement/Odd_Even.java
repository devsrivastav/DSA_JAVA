package DSA_Programming.Conditional_Statement;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to find is it even or odd ");
        int number =sc.nextInt();
        if (number % 2 ==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
