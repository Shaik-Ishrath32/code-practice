import java.util.*;
public class maxmin {
    public static int findmax(int a,int b,int c){
        int maximum = a;
        if(b>maximum){
            maximum = b;
        }
        if(c>maximum){
            maximum = c;
        }
        return maximum;
    }
    public static int findmin(int a,int b,int c){
        int minimum = a;
        if(b<minimum){
            minimum = b;
        }if(c<minimum){
            minimum = c;
        }
        return minimum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = findmax(a,b,c);
        int min = findmin(a,b,c);
        System.out.println("Maximum Number:"+max);
        System.out.println("Minimum Number:"+min);
    }
}
