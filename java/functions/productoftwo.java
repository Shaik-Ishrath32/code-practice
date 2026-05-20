import java.util.*;
public class productoftwo {
    public static int product(int n,int m){
        return n*m;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = product(n,m);
        System.out.println(result);

    }
}
