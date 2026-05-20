import java.util.*;
public class Concatenationofarray {
    public static int[] getconcatenation(int[]arr){
        int n = arr.length;
        int [] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = getconcatenation(arr);
        System.out.print(Arrays.toString(result));


    }
}
