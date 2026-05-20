import java.util.*;


public class Buildarrayfrompermutation {
    public static int[] buildarray(int[]arr){
        int n = arr.length;
        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = buildarray(arr);
        System.out.println(Arrays.toString(ans));

    }
}
