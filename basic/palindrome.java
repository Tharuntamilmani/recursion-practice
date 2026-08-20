import java.util.*;
public class palindrome {
    public static boolean checkp(String s, int start, int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return checkp(s,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String s = c.nextLine();
        if(checkp(s,0,s.length()-1)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
