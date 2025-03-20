/*Calculate the sum of all the elements in the given array.
 input: arr[]={1,5,3}
 output:9
 */

package DSA_Programming.ArrayProgramming;

public class Quesion1 {
    void SumOfArray(){
        int[] arr = {1,4,5,6,1};
        int sum =0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Quesion1 obj = new Quesion1();
        obj.SumOfArray();
    }
}
