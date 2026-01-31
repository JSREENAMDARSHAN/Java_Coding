import java.util.Arrays;

public class bubblesort{
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int x = arr.length;
        for(int i = 0;i<x-1;i++){
            for(int j =0 ;j<x-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}