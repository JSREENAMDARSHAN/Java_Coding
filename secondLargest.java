public class secondLargest {
    public static void main(String[] args) {
        int[] n = {10, 5, 20, 8, 20, 15};
        int largest = Integer.MIN_VALUE;
        int second_larget = Integer.MAX_VALUE;

        for(int i : n){
            if(i>largest){
                second_larget = largest;
                largest = i;
            }
            else if(i>second_larget && i!=largest){
                second_larget = i;
            }
        }
        System.out.println(second_larget);
    }
}
