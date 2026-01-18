import java.util.*;
public class BinomialCoefficient {

    public static void binomial(int n , int r){

        int c;
        int a = 1;
        int b = 1;
        int d = 1;
        for(int i=1;i<=n;i++){
            a=a*i;
           
        }
        System.out.println("factorial of n is :- "+ a);
         for(int i=1;i<=r;i++){
            b=b*i;
           
        }
        System.out.println("factorial of r is " +b);
        for(int i = 1;i<=(n-r);i++){
           d=d*i;
        }
        System.out.println("factorial of (n-r) is :-" +d);
        c=a/(b*(d));
        System.out.println("Binomial coeffient " + c);
        
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r ");
        int r = sc.nextInt();
        binomial(n, r);
        
    }
    
}
