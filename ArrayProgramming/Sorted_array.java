/*Check if the given array is sorted or not. */
package DSA_Programming.ArrayProgramming;

import java.util.Scanner;

public class Sorted_array {
    
    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }

    // static int lastOccurences(int[] arr, int x){
    //     int lastIndex = 1;
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] == x){
    //             lastIndex = i;
    //         }
    //     }
    //     return lastIndex;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + "elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("IS sorted: " + isSorted(arr));
    }
}
