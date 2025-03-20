package DSA_Programming.Conditional_Statement;

public class Reverse_Number {
    public static void main(String[] args) {
        int n = 108999;
        while (n>0) {
            int lastDigit = n%10;
            System.out.println(lastDigit);
            n = n/10;
        }
        System.out.println();
    }
}
