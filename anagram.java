import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "raced";
        String str2 = "cares";
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        if(str1.length()!=str2.length()){
            System.out.println("Not an anagram");
            return;
        }
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1, char2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not a anagram");
        }
    }
}
