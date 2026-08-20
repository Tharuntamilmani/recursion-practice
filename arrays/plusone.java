import java.util.*;
public class plusone {
    static int[] oneplus(int[] arr, int i){
        if(i<0){
            int[] ans=new int[arr.length+1];
            ans[0]=1;
            return ans;
        }
        if(arr[i]<9){
            arr[i]++;
            return arr;
        }
        arr[i]=0;
        return oneplus(arr,i-1);
    }
    public static void main(String[] args) {
        int[] arr ={9,9,9};
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int[] result = oneplus(arr,arr.length-1);
        for(int x: result){
            System.out.print(x+" ");
        }
    }
}
