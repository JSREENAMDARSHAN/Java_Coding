import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        int n = sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i = 1 ;i<=n;i++){
            int next = a+b;
            System.out.print(next+" ");
            a = b;
            b = next;
        }
    }
}