import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int n[] = {1,1,2,3,2,4,7};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n.length;i++){
            map.put(n[i],map.getOrDefault(n[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer>entry: map.entrySet()){
             System.out.print(entry.getKey()+" ");
        }
    }
}
