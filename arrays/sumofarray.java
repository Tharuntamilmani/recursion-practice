import java.util.*;
public class sumofarray {
    public static int sum(int[] arr,int i){
        int sumt=arr[i];
        if(i==arr.length-1){
            return sumt;
        }
        return sumt+sum(arr,i+1);
    }
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = c.nextInt();
        }
        System.out.println(sum(arr,0));
    } 
}
