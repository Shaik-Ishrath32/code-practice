import java.util.*;
public class naturalnumbers {
    public static int nnaturalnumbers(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            
        }
        System.out.println();
        return (n*(n+1))/2;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = nnaturalnumbers(n);
        System.out.print(result);
    }
}
