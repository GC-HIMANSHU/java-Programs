
    import java.util.*;
public class PrimeRange {

  public static boolean primeno(int n){
    if(n==2){
        System.out.println("it is a prime no:-");
    }
    for(int i=1;i<=Math.sqrt(n);i++){
        if(n%2==0){
        System.out.println("not a prime no:-");
        break;
    }
        System.out.println("is a prime no:-");
  }
    return false;
}

    public static void primerange(int n){
        for(int i=2;i<=n;i++){
            if(primeno(i)){
                System.out.println(i+"");

            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
       primerange(n);
        




        
    }
}
