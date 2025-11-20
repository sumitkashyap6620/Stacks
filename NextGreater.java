import java.util.* ;
public class NextGreater{
    public static void main(String args[]){
        Stack<Integer> st =  new Stack<>(); 
        Scanner sc = new Scanner (System.in);
        System.out.print("Give length of array :- ");
        int[] arr = new int[sc.nextInt()] ; 
        System.out.println("Give array :- ");
        for (int i = 0 ; i < arr.length ; i++)
           arr[i] = sc.nextInt();
        int res[] = new int[arr.length] ;
        res[arr.length-1]  = -1 ;
        st.push(arr[arr.length-1]);
        for(int i = arr.length-2; i >=0 ; i--){
            while(arr[i] > st.peek()){
                st.pop();
               
                if(st.size()==0){
                   res[i] = -1 ;
                   st.push(arr[i]);
                   break ;
                 }
                
            }
            if(arr[i] < st.peek()){
                    res[i] = st.peek();
                    st.push(arr[i]);
                }
            
        }

        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i]+" ");
        }
    }
}