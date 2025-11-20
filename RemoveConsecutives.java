import java.util.* ;
public class RemoveConsecutives{
    public static void main(String args[]){
        Stack<Integer> st =  new Stack<>(); 
        Scanner sc = new Scanner (System.in);
        System.out.print("Give length of array :- ");
        int[] arr = new int[sc.nextInt()] ; 
        System.out.println("Give array :- ");
        for (int i = 0 ; i < arr.length ; i++)
           arr[i] = sc.nextInt();
          int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(st.size() == 0 || arr[i] != st.peek() ){
                 st.push(arr[i]);
                 count++ ;
            }
            else{
                if(i == arr.length-1 || arr[i] != arr[i+1]){
                    st.pop();
                    count-- ;
                }   
            }
           
        }
         int i = count-1 ;
        while(st.size() != 0 ){
            arr[i] = st.pop() ;
            i-- ;
        }
        for (int k = 0  ; k<count ; k++){
            System.out.print(arr[k]+" ");
        }
    }
}