import java.util.Arrays;

public class zigzagconvert{
    public static void main(String[]args){
        String s = "PAYPALISHIRING";
        int n = 3;
        StringBuilder[] st = new StringBuilder[n];
        for(int i =0 ;i<n;i++){
            st[i] = new StringBuilder();
        }
        int currRow = 0;
        boolean gd = false;
        for(char c:s.toCharArray()){
            st[currRow].append(c);
            if(currRow ==0 || currRow == n-1){
                gd = !gd;
            }
            currRow+= gd?1:-1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb: st){
            res.append(sb);
        }
        System.out.println(res);
    }
}