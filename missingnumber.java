
public class missingnumber {
    public static void main(String[] args) {
        int n[] = {1,2,4};
        int x = Integer.MIN_VALUE;
        for(int i:n){
            if(i>x){
                x=i;
            }
        }
        int sum = 0;
        int sum1 = 0;
        for(int i:n){
            sum1+=i;
        }
        for(int i =1;i<=x;i++){
            sum += i;
        }
        System.out.println(sum-sum1);
        
    }
}
