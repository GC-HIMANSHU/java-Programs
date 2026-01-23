import java.util.*;
public class ProductOfAandB {

    public static void product(int a , int b){

        int  product = a*b;
            System.out.println("product of a and b :-"+ product);

     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
         int a = sc.nextInt();
          System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        product(a , b);
       
        
    }
    
}
