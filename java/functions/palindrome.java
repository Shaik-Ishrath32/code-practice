import java.util.*;
public class palindrome {
    public static boolean ispalindrome(int n){
        int original = n;
        int reversed = 0;
        while(n>0){
            int digit = n%10;
            reversed = reversed*10+digit;
            n /= 10;
        }
        return reversed == original;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(ispalindrome(n)){
            System.out.println(n+"is a palindrome");
        }else{
            System.out.println(n+"is not a palindrome");
        }
    }
}
