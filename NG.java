import java.util.Scanner ;
import java.util.Stack ;
public class NG{
public static void main(String args[]){
    int arr[] = {1,3,2,1,8,6,3,4};
    int res[] = new int[arr.length];
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    Stack<Integer> st = new Stack<>();
    for(int i = arr.length-1 ; i >= 0 ; i--){
        // if(st.size() == 0){
        //     res[i] = -1 ;
        //     st.push(arr[i]); 
        // }
        // else{
            while(st.size() !=0 && arr[i]>st.peek()){
              st.pop();
            }
              if(st.size()==0){
                 res[i] = -1 ;
                 st.push(arr[i]);
                }
           else if(st.peek()>arr[i]){
                res[i] = st.peek();
                st.push(arr[i]);
            }
        // }
    }
    for(int i = 0 ; i <arr.length ; i++)
        System.out.print(res[i]+" ");
}
}