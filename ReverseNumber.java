
    import java.util.*;
public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int a = sc.nextInt();
        int rev = 0;
        while (a>0){
            int lastdigit=a%10;
            rev = (rev*10)+lastdigit;
             a = a/10;
        }
        System.out.print(rev);

    
    }
}
