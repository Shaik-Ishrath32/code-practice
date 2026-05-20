import java.util.*;;
public class armstrong {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//first number
        int m = sc.nextInt();//second number
        /*Armstrong number-logic
        1.count the digits in number
        2.sum of each digit raised to that power
        3.if sum == original number
        4.print armstrong number*/
        
        for(int i=n;i<=m;i++){
            int count = i;
            int sum = 0;
            int d = String.valueOf(i).length();
            while(n>0){
                int r = n%10;//last digit
                sum += Math.pow(r,d);
                n/=10;
            }
            if(sum == i){
                System.out.print(i+" ");
            }
        }
    }
}
