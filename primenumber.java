public class primenumber {
    public static boolean isprime(int num){
        if(num<2){
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num%2==0){
            return false;
        }

        for(int i = 3;i<=Math.sqrt(num);i+=2){
            if(num%i == 0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isprime(n) ? "Prime number" : "not a prime");
    }
}
