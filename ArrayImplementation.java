public class ArrayImplementation{
    public static class Stack{
        int arr[] = new int[10];
        int top = -1;

        int pop(){
          if(top == -1){
            System.out.println("Stack Underflow !");
            return -1;
          }
          int x = arr[top] ;
          top -- ;
          return x ;
        }
     void push(int a){
        if(top == 9){
            System.out.print("Stack overFlow !");
            return ;
        }
        top++ ;
        arr[top] = a ;
        
     }
     void  display(){
        int temp = 0 ;
        while(temp <= top){
            System.out.print(arr[temp] +" ");
            temp++;
        }
     }

    }
    public static void main(String[] args) {
       Stack st = new Stack ();
       st.push(5); 
       st.push(15); 
       st.push(25); 
       st.display();
       System.out.println();
        st.pop();
        // st.display();
        // System.out.println();
        // st.pop();
        // st.display();
        // System.out.println();
        // st.pop();
       st.pop();
       st.pop();
       st.push(2);
       st.push(20);
       st.push(21);
       st.push(23);
       st.push(25);
       st.push(26);
       
       st.push(22);
       st.push(27);
       st.push(29);
       st.push(25);
       st.display();
    //    st.push(265);
    //    st.push(27);
    }
}