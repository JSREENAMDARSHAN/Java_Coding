import java.util.*;
public class countfrequency {
    public static void main(String[] args){
        String str = "abbba";
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        
    }
}
