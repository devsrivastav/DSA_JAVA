package DSA_Programming.ArrayProgramming;

import java.util.Scanner;

public class Array_Reference {

    //creating a method 
    static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
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
    
        // for(int i =0; i < n; i++){
        //     System.out.print(arr[i] + " ");
        // }

        //trying to copy arr to arr_2
        int[] arr_2 = arr;
        System.out.println("Copied arr_2");
        printArray(arr_2);

        //changing some values of arr2
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("Original array after changing arr_2");
        printArray(arr);

        System.out.println("Copied arr_2 after changing arr_2");
        printArray(arr_2);
        sc.close();
    }
}
