import java.util.Arrays;
import java.util.stream.Collector;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=1;
        reverse(0,arr.length-1,arr);
         reverse(0,k-1,arr);
         reverse(k, arr.length-1,arr);
        for (int a:arr
             ) {
            System.out.print(" "+a);
        }

    }

    public static void reverse(int len1,int len2,int arr[]){
        while(len1 < len2){
            int temp=arr[len1];
            arr[len1]=arr[len2];
            arr[len2]=temp;
            len1++;
            len2--;
        }
    }
}
