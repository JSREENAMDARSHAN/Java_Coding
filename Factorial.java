import java.util.*;;
public class Factorial {
    public int factorial_num(int num){
        if(num <=1){
            return 1 ;
        }
        else{
            return num*factorial_num(num-1);
        }
    }
    public static void main(String[] args) {
        Factorial ob = new Factorial();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ob.factorial_num(n));
        int x = 1;
        for(int i = n;i >=1;i--){
            x = x * i;
        }
        System.out.println("Iterative: "+x);
        sc.close();
    }
}
