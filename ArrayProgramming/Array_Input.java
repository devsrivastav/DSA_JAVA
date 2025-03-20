package DSA_Programming.ArrayProgramming;

import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n =sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
    
        System.out.println("Enter " + n + " elements");
        for(int i =0; i < arr.length; i++){
            arr[i] =sc.nextInt();
        }
    
        for(int i =0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
   
}
