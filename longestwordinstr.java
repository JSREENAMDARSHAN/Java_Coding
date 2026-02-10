import java.util.Arrays;

public class longestwordinstr {
    public static void main(String[] args) {
        String str = "I love programming darshanabcdefghijklmn";
        String[] nstr = str.split(" ");
        String longest = "";
        for(String word: nstr){
            if(word.length() >longest.length()){
                longest = word;
            }
        }
        System.out.println(longest);
    }
}
