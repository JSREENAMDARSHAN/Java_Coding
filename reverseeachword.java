import java.util.Arrays;

public class reverseeachword {
    public static void main(String[] args) {
        String str = "My name is Darshan";
        String[] s = str.split(" ");
        String revString= "";
        for(String word:s){
            String rev="";
            for(int i = word.length()-1;i>=0;i--){
                rev+=word.charAt(i);
            }
            revString+=rev+" ";
        }
        System.out.println(revString);
        
    }
}
