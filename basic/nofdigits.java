import java.util.*;
public class nofdigits {
    public static int count(int n,int c){
        if(n<=0){
            return c;
        }
        return count(n/10,c+1); 
    }
    public static void main(String[] args) {
        System.out.println(count(456,0));
    }
}
