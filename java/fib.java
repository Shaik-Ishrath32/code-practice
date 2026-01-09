import java.util.*;
public class fib {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int sec = 1;
        for(int i=0;i<=n;i++){
            System.out.println(first+" ");
            int third = first+sec;
            first = sec;
            sec = third;
        }

    }
}
