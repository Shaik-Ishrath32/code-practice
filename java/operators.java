import java.util.*;
public class operators {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char op = sc.nextLine().charAt(0);
        if(op == '+'){
            System.out.println("Result:"+(n+m));
        }else if(op == '-'){
            System.out.println("Result:"+(n-m));
        }else if(op == '*'){
            System.out.println("Result:"+(n*m));
        }else if(op == '/'){
            System.out.println("Result:"+(n/m));
        }else if(op =='%'){
            System.out.println("Result:"+(n%m));
        }else{
            System.out.println("Invalid operator");
        }

    }
}
