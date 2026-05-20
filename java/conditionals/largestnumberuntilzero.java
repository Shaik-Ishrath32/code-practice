import java.util.*;

public class largestnumberuntilzero {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        while(n>0){
            if(max > n){
                n = max;
            }
            n = sc.nextInt();
            System.out.print(n);

        }
    }
}
