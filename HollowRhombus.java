import java.util.*;
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lines");
        int n = sc.nextInt();
        System.out.println("Enter the value of rows");
        int r = sc.nextInt();
        System.out.println("ENter the values of colomns");
        int c = sc.nextInt();
        for(int i=1;i<=r;i++){
            //spaces
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
                for(int j=1;j<=c;j++){
                
                if(i==1||i==r||j==1||j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
