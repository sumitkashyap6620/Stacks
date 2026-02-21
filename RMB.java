import java.util.*;
public class RMB{
    public static int rmb(String a){
        int n = a.length();
        int count = 0 ;
        Stack<Character> st =  new Stack<>();
        for(int i = 0 ; i < n  ; i++){
            if(a.charAt(i)=='('){
                st.push('(') ;
            }
            else if(a.charAt(i)==')' && st.size()!=0 ){
            st.pop();
            }
            else if (a.charAt(i)==')' && st.size()==0)count++;
        }
        return count+st.size();
    }
    public static void main(String args[]){
     System.out.print("Give a String :- ");
     Scanner sc =  new Scanner(System.in);
     String s = sc.next();
     System.out.println(s);
      System.out.println(rmb(s));

    }
}