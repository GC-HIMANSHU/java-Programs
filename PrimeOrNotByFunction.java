
    import java.util.*;
public class PrimeOrNotByFunction {

    public static void prime(int n){

        if(n%2==0){
            System.out.println("it is a prime no");
        }
        for(int i = 2;i<=Math.sqrt(n);i++)
        if(n%2==0){
            System.out.println(" not prime number");
        }
    
            System.out.println("prime no.");
        

    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n = sc.nextInt();
        prime(n);
        
    }

    
}
