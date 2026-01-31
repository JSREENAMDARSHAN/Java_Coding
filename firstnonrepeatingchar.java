import java.util.*;
public class firstnonrepeatingchar {
    public static void main(String[] args) {
        String s = "welcome";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
           
                map.put(c, map.getOrDefault(c,0)+1);
            
        }
        for(int i =0 ;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                System.out.println("First non repeated is : "+s.charAt(i));
                break;
            }
        }
        
    }
}
