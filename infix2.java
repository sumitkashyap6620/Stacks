import java.util.Stack;
public class infix2{
    public static void main (String args[]){
        String s = "9+5+8/2*3";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
          char ch = s.charAt(i);
          int ascii = (int)ch ;
          if(ascii >= 48 || ascii <=57)val.push(ascii - 48);
          else if(op.size()==0 || ch == '(')op.push(ch);
          else{
            if(ch == ')'){
                while(op.peek() != '('){
                    int v1 = val.pop();
               int v2 = val.pop();
              if (op.peek() == '+') val.push(v2+v1);
              if (op.peek() == '-') val.push(v2-v1);
              if (op.peek() == '*') val.push(v2*v1);
              if (op.peek() == '/') val.push(v2/v1);
                  op.pop();
                }
                op.pop();
            }
              if(ch == '+' || ch == '-'){
               int v1 = val.pop();
               int v2 = val.pop();
              if (op.peek() == '+') val.push(v2+v1);
              if (op.peek() == '-') val.push(v2-v1);
              if (op.peek() == '*') val.push(v2*v1);
              if (op.peek() == '/') val.push(v2/v1);
                  op.pop();
                  op.push(ch);
              }

               if(ch == '/' || ch == '*'){
                if(op.peek() == '/' || op.peek() == '*'){
                int v1 = val.pop() ;
                int v2 = val.pop() ;
                if(op.peek()== '*')val.push(v2*v1);
                if(op.peek()== '/')val.push(v2/v1);
                op.pop();
                op.push(ch);
               }
               else op.push(ch);
            }
               
              }
          }

          while (val.size() > 1) { 
              int v1 = val.pop();
               int v2 = val.pop();
              if (op.peek() == '+') val.push(v2+v1);
              if (op.peek() == '-') val.push(v2-v1);
              if (op.peek() == '*') val.push(v2*v1);
              if (op.peek() == '/') val.push(v2/v1);
                  op.pop();
             }
             System.out.print(val.peek());
        }
    }
