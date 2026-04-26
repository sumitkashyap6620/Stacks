import java.util.*;
public class ReverseStack{
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
    public static void reverse(Stack<Integer> st){
      if (st.size() == 0)return ;
     
      else{ 
        int top = st.pop();
        reverse(st);
        add(st, top);
      }
    }
    public static void main(String[] args) {
        Stack<Integer> st =  new Stack <>(); 
        st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       st.push(60);
       reverse(st);
       System.out.println(st);
    }
}