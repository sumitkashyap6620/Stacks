import java.util.*;
public class infix{
  

   public static void main(String args[]){
    System.out.println("Infix program :-");
    String s = "9-5+3*4/6" ;
    Stack<Integer> val = new Stack<>();
    Stack<Character>  op = new Stack<>();

    for(int i = 0 ; i < s.length() ; i++){
        char c = s.charAt(i) ;
        int ascii = (int)c;
        if(ascii >=48 && ascii <=57)   val.push(ascii-48);
        else if(op.size()==0)op.push(c);
        else{
            if(c == '+' || c == '-'){
            //   work !!!!
            int v1 = val.pop();
            int v2 = val.pop();
            
            if(op.peek() == '+') val.push(v2 + v1);
            if(op.peek()  == '-') val.push(v2 - v1);
            if(op.peek()  == '*') val.push(v2 * v1);
            if(op.peek()  == '/') val.push(v2 / v1);
            op.pop();
            op.push(c);
            }
           if( c == '*' || c =='/' ){
             if(op.peek()=='*' || op.peek()=='/'){  
                  int v1 = val.pop();
            int v2 = val.pop();
            
             if(op.peek()  == '*') val.push(v2 * v1);
            if(op.peek()  == '/') val.push(v2 / v1);
            op.pop() ;
            op.push(c);
            }
             else  op.push(c);
        }
           
                
            
        }
    }

       while(val.size()>1){
         int v1 = val.pop();
            int v2 = val.pop();
            
            if(op.peek()  == '+') val.push(v2 + v1);
            if(op.peek()  == '-') val.push(v2 - v1);
            if(op.peek() == '*') val.push(v2 * v1);
            if(op.peek()  == '/') val.push(v2 / v1);
            op.pop();
       }
         System.out.print(val.peek());
   }
}