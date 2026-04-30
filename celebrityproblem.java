import java.util.Scanner ;
public class celebrityproblem{
    public static int celebraty(int[][] mat){
    // code left 
    return 1 ;
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