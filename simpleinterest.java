import java.util.*;
public class simpleinterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();//initial amount
        int t = sc.nextInt();//time in years
        int r = sc.nextInt();//annual rate
        double si = (p*t*r)/100;//interest
        double totalamount = p+si;
        System.out.println(totalamount);

    }
}
