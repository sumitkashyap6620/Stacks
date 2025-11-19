public class LLimplementation{
    public static class  node {
        int data ;
        node next ;
    }
    public static class Stack{
       node top ;

       void push(int a){
        node temp = new node();
        temp.data = a ;
        temp.next = top ;
        top = temp ;
       }
       void displayrec(node h){
        if(h == null)return ;
             displayrec(h.next);
             System.out.print(h.data+" ");
       }
       void display(){
        if(top == null){
            System.out.println("Empty Stack !");
            return ;
        }
        displayrec(top);
       }
       int pop(){
         if(top == null){
            System.out.print("Stack underflow !");
            return -1 ;
         }
         int x = top.data ; 
         top = top.next ;
         return x ;
       }
    }
    public static void main(String args[]){
        Stack st =  new Stack();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
       st.display();
        System.out.println();
        System.out.println(st.pop());
        st.display();
        System.out.println();
         System.out.println(st.pop());
        st.display();
        System.out.println();
         System.out.println(st.pop());
        st.display();
        System.out.println();
         System.out.println(st.pop());
        st.display();
        System.out.println();
         System.out.println(st.pop());
        st.display();
        System.out.println();
         System.out.println(st.pop());
        st.display();
        System.out.println();
         System.out.println(st.pop());
        st.display();
        System.out.println(st.pop());
    }
}