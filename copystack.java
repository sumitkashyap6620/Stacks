import java.util.Stack ;
import java.util.Scanner ;
public class copystack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> tst = new Stack<>();
        Stack<Integer> cst = new Stack<>();
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size :- ");
        int n = sc.nextInt();
        System.out.println("enter the elements :- ");
        for(int i = 0 ; i < n ; i++){
               st.push(sc.nextInt());
        }
       System.out.println(st);
        while (st.size()!=0) {
            tst.push(st.peek());
            st.pop();
        }
         while (tst.size()!=0) {
            cst.push(tst.peek());
            tst.pop();
        }
        System.out.println(cst);
       
    }
}