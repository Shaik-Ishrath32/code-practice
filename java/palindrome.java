import java.util.*;
public class palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(s.equals(rev)?"Palindrome":"Not Palindrome");
    }
}
