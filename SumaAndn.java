import java.util.*;
public class SumaAndn {
    public static void calculator(int a , int b){
        int sum = a+b;
        System.out.println("sum of a and b :-"+sum);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of a :-");
         int a = sc.nextInt();
         System.out.println("Enter the value of b :-");
         int b = sc.nextInt();
         calculator(a, b);

     

    }

}

