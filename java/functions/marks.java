import java.util.*;
public class marks {
    public static String grades(int m){
        if(m <= 40) return "Fail";
        else if(m >40 && m<= 50) return "DD";
        else if(m >50 && m<= 60) return "CC";
        else if(m > 60 && m<= 70) return "BB";
        else if(m > 70 && m<= 80) return "AB";
        else return "AA";

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String result = grades(m);
        System.out.println(result+" grade for the "+ m +" marks");


    }
}
