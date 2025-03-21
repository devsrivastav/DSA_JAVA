package DSA_Programming.ArrayProgramming;

/*FIND THE SECOND LARGEST ELEMENT IN THE GIVEN ARRAY.
    ANS WILL BE ALWAYS EXIST.
 */
import java.util.Scanner;

public class SecondLargest {

    //FIND MAX VALUE 
        static int findMax(int[] arr){
            int mx = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
                if(arr[i] > mx){
                    mx = arr[i];
                }
            }
            return mx;
        }

        //FIND SECOND MAX VALUE
    static int findSecondMax(int[] arr){
        int mx = findMax(arr);

        for(int i=0; i<arr.length; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Maximum Element: " + findSecondMax(arr));
    }
}

