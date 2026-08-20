import java.util.*;
public class multitillk {
    public static void  table(int n,int k,int i){
        if(i>k){
            return;
        }
        System.out.println(n + " X " + i + " = " + (n*i));
        table(n,k,i+1);
    }
    public static void main(String[] args) {
        table(7, 10, 0);
    }
}
