import java.util.*;
public class linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int x = sc.nextInt();
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt(); 
        }
        for(int i = 0;i<a.length;i++){
            if(a[i] == x){
                    System.out.println("Element found at index: "+i);
                    return;
            }
        }
        System.out.println("Not found");
        sc.close();
       
    }
}
