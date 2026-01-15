import java.util.Stack ;
public class largesthistogram{
    public static void disp(int a[]){
      for(int i = 0 ; i <a.length ; i++)System.out.print(a[i]+" " );
    }
    public static int[] PSE(int[] a ){
        int[] pse = new int[a.length] ;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < a.length ; i++){
            while(st.size()!=0 && a[i] <a[st.peek()])st.pop();
            if(st.size()==0){
                st.push(i) ;
                pse[i] = -1 ;
            }
            else{
                pse[i] = st.peek();
                st.push(i);
            }
        }
        disp(pse);
         System.out.println();
        return pse ;
    }
    public static int[] NSE(int[] a){
        int nse[] = new int[a.length] ;
         Stack<Integer> st = new Stack<>() ;
        //  st.push(a[a.length-1]);
        //  nse[a.length-1] = -1 ;
         for(int i = a.length-1 ; i >=0 ; i--){
            while(st.size()!=0 && a[st.peek()] > a[i])
                st.pop() ;
             if(st.size()==0){
                nse[i] = a.length ;
                st.push(i) ;
            }
            else{
                nse[i] = st.peek() ;
                st.push(i) ;
            }
         }
         disp(nse);
         System.out.println();
         return nse ;
    }
public static void main(String[] args) {
    //  int arr[] = {5,2,4,6,3,5};
     int arr[] = {2,1,5,6,2,3};
   int[] nse = new int[arr.length] ;
   int[] pse = new int[arr.length] ;
   nse = NSE(arr);
   pse = PSE(arr);
   int max = -1 ;
   for(int i = 0 ; i < arr.length ; i++){
    int area = arr[i]*(nse[i]-pse[i]-1);
     if(max<area)max = area ;
   }
   System.out.println("max area = "+max);
}
}