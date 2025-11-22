import java.util.Scanner ;
import java.util.Stack;
public class PreviousSmallerElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give length of array :- ");
        int n = sc.nextInt();
        int[] arr = new  int[n] ;
        System.out.print("Give array :- ");
        for (int i = 0 ; i < n ; i++)
              arr[i] = sc.nextInt();
         int[] ans = new int[n] ;
         Stack<Integer> st = new Stack<>();

        //   Start.....
           ans[0] = -1 ;
           st.push(arr[0]);
           for(int i = 1 ; i < n ; i++){
            while(st.size() != 0 && arr[i] < st.peek()){
                st.pop();
            }
            if(st.size()==0){
                ans[i] = -1 ;
                st.push(arr[i]) ;
            }
            else{
                ans[i] = st.peek();
                st.push(arr[i]);
            }
           }
          
        

        for (int i = 0 ; i < n ; i++)
              System.out.print(ans[i]+" ");
    }
}