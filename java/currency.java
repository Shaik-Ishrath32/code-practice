import java.util.*;
public class currency {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();//amount in rupees
        double usd = n/83;//1 USD = 83 INR
        System.out.println("Amount in USD ="+usd);

    }
}
