public class longestpalindromesubstr{
    public static boolean ispalindrome(String s, int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "babad";
        int length =0,start=0,end=0;
        for(int i =0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(ispalindrome(s, i, j)){
                    if((j-i+1)>length){
                        length = j-i+1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        System.out.println(s.substring(start,end+1));
    }
}