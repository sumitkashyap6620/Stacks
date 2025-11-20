import java.util.* ;
public class aray{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Give length of array :- ");
        int[] arr = new int[sc.nextInt()] ; 
        System.out.println("Give array :- ");
        for (int i = 0 ; i < arr.length ; i++)
           arr[i] = sc.nextInt();
         int res[] = new int[arr.length] ; 
         int l = 0 ;
         
          for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != arr[i+1] && arr[i] != arr[i-1]){
            res[l] = arr[i] ;
            l++ ;
           }  
                }
    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(res[i])
    }
}
}