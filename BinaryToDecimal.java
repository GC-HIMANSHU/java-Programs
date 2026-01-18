import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int powe = 0;
        int lastdigit=0;
        int bin = 0;
        while(n>0){
            lastdigit = n%10;
            bin = bin + (int)(lastdigit*Math.pow(2, powe));
            powe++;

        }
        System.out.println("Decimal value of given no."+bin);
    }
    
}
