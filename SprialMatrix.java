import java.util.*;
public class SprialMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length ,  m = matrix[0].length;
        // outer loop 
        for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
                matrix[i][j] = sc.nextInt();

                }
            }
            //printing loop
            for(int i=0;i<n;i++){
            for(int j=0;i<m;j++){
                System.out.print( matrix[i][j] + " ");

                }
                System.out.println();
            }
        }

    }

