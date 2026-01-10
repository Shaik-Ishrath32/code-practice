import java.util.*;
public class evenodd {
    public static String checkevenodd(int n){
        if(n%2 == 0){
            return n+"is even";
        }else{
            return n+"is odd";
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = checkevenodd(n);
        System.out.println(result);
    }
}
