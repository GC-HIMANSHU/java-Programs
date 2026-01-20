import java.util.*;
    public class Matrix {
    public static boolean matrixfind(int matrixs[][] ,  int key){
         for(int i=0;i<matrixs.length;i++){
            for(int j=0;j<matrixs[0].length;j++){
             if(matrixs[i][j] == key){
                System.out.println("found at " + i + "," + j);
                return true;

            }
        }
           
    }
    return false;
        
}
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int matrixs[][] = new int[3][3];
        int n = matrixs.length ,  m = matrixs[0].length;
        // outer loop 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrixs[i][j] = Sc.nextInt(); 
            }
        }
        // For print the elements
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print( matrixs[i][j] + " ");
            }
            System.out.println();
        }
       matrixfind(matrixs, 5);
    }
     
    
}

    

