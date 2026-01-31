import java.util.*;

public class vowels_consonants{
    public static void main(String[] args){
        String vowels = "aeiouAEIOU";
        String str = "darshan";
        int vowelcnt = 0,consonant_cnt = 0;
        List<Character> vowelslist = new ArrayList<>(); 
        List<Character> consonantlist = new ArrayList<>();

        for(char i:str.toCharArray()){
            if(vowels.indexOf(i)!=-1){
                vowelcnt++;
                vowelslist.add(i);
            }
            else if(Character.isLetter(i)){
                consonant_cnt++;
                consonantlist.add(i);
            }
        }
        System.out.println("Vowel count: "+vowelcnt + vowelslist);
        System.out.println("Consonant count: "+consonant_cnt + consonantlist);

    }
}