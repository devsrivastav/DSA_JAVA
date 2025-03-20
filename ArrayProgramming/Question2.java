/*calculate the maximum value out of all the elements in the array.
 input: arr[]={1,5,3}
 output:5
 */

package DSA_Programming.ArrayProgramming;

public class Question2 {
    void maxOfArray(){
        int[] arr = {5,3,6,2,8,4};
        int ans=0;

        for(int i=0; i<arr.length; i++){
            if (arr[i]>ans) {
                ans=arr[i];
            }
        }
        System.out.println("Max " + ans);
    }
    public static void main(String[] args) {
        Question2 obj = new Question2();
        obj.maxOfArray();
    }
}
