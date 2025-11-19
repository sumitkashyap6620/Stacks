import java.util.Stack ;
import java.util.Scanner ;
public class copystack{
    public static void displayr(Stack<Integer> s){
        if(s.size()==0)return ;
        int x = s.pop();
        displayr(s);
        System.out.print(x+ " ");
        s.push(x);
    }
     public static void insB(Stack<Integer> s , int a ){
        if(s.size()==0){
            s.push(a);
            return ;

        }
        int x = s.pop();
        insB(s, a);
        s.push(x) ;
        
    }
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
       insB(st , 8 );
       displayr(st);
       System.out.println();
       System.out.println(st);
        // while (st.size()!=0) 
        //     tst.push(st.pop());
        //     while (tst.size()!=0) 
        //     cst.push(tst.pop());
        // System.out.println(cst);
       
    }
}