import java.util.*;
public class test2 {
    public static int f(int n){
        if(n==0){
            System.out.println("Base case Reached");
            return 0;        
        }
        System.out.println("Enter level:"+n);
        int sr=f(n-1);
        return n+sr;
    }
    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
