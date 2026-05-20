import java.util.*;
public class circle {
    public static double circumference(int r){
        return 2*3.14*r;
    }
    public static double area(int r){
        return 3.14*r*r;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double c = circumference(r);
        double a = area(r);
        System.out.println(c);
        System.out.print(a);
    }
}
