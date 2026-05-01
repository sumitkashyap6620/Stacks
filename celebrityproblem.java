import java.util.Scanner ;
import java.util.Stack ;
public class celebrityproblem{
    public static int celebraty(int[][] mat){
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < mat.length ; i++){
            st.push(mat[0][i]);
        }
        while(st.size()>1){
      int a = st.pop() ;
     int b = st.pop();
     boolean aflag = true ;
     boolean bflag = true ;
      //a not celebrity
         if(mat[a][b] == 1) aflag  = false ;
         if(mat[b][a] == 1) bflag  = false ;
         if(mat[a][b] == 0) bflag  = false ;
         if(mat[b][a] == a) aflag  = false ;
        if(aflag)st.push(a);
        if(bflag)st.push(b);
        }
        if(st.size()==0)return -1 ;
        int ele =st.pop();
         for(int i = 0 ; i < mat.length ; i++){
             if(ele == i)continue;
             if(mat[ele][i]==1)return -1 ;
         }
         for(int i = 0 ; i < mat.length ; i++){
             if(ele == i)continue;
             if(mat[i][ele]==0)return -1 ;
         }
         return ele ;
    }
public static void main (String[] args ){
     Scanner sc = new Scanner (System.in);
    System.out.println("Give order of matrix :-");
    int o = sc.nextInt();
    System.out.println("Give a 2D matrix ");
   int[][] mat = new int[o][o];
   for(int i = 0 ; i < o ; i++){
    for(int j = 0 ; j < o ; j++){
        mat[i][j] = sc.nextInt(); 
    }
   }
     System.out.println("celebraty is :- " + celebraty(mat));
}
}