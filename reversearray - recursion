import java.util.*;
public class reversearray {
    public static void reverse(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr,start+1,end-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr,0,arr.length-1);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
