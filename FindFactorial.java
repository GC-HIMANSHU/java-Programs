import java.util.*;
public class FindFactorial {
    public static void factorial(int n){

    int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
           
        }
         System.out.println("factorial of given number :- "+f);
            

    }
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of n");
        int n = sc.nextInt();

        factorial(n);
    }

    

}
    
