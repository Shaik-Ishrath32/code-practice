import java.util.*;
public class pythagorean {
    public static double hypo(int a,int b){
        int sqofa = a*a;
        int sqofb = b*b;
        int c = sqofa + sqofb;
        return Math.sqrt(c);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = hypo(a,b);
        System.out.println(result);


    }
}
