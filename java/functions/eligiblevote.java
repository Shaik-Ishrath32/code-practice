import java.util.*;
public class eligiblevote {
    public static String eligible(int age){
        if(age <= 18){
            return "Not eligible for vote";
        }else{
            return "Eligible for vote";
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String result = eligible(age);
        System.out.print(result);

    }
}
