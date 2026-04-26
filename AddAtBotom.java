import java.util.* ;
public class AddAtBotom{
    public static void add(Stack<Integer> st , int ele){
        if(st.size()==0){
            st.push(ele) ;
             return ;
            }
            else{
       int top = st.pop();
       add(st,ele);
       st.push(top);
            }
    }
    public static void main(String args[]){
       Stack<Integer> st = new Stack<>();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       st.push(60);
       int ele = 202 ;
       add(st, ele);
       System.out.print(st);
       
    }
}