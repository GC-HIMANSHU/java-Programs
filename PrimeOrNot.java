import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
                for (int a=2;a<=n-1 ;a++){
                    if(n%a==0){
                        System.out.println("NOt prime");
                    }
                    else {
                        System.out.println("prime");
                    }
                 
                }
    }
    
}

