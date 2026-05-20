import java.util.*;
public class Runningsumodarray {
    public static int[] runningsum(int[]arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(runningsum(arr)));

    }
}
