import java.util.*;
public class PositiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a>0){
            System.out.print("The number is positive");
        }
        else if(a==0){
            System.out.print("The number is zero");
        }
        else {
            System.out.print("The number is negative");
        }
        
    }
    
}
