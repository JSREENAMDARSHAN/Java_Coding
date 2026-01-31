public class binarysearch {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6};
        int x = 4;
        int left = 0;
        int right = n.length-1;
        while(left<=right){
            int mid =  left + (right - left)/2;
            if(n[mid] == x ){
                System.out.println(mid);
                return;
            }
            if(n[mid] < x){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
    
    }
    
}
