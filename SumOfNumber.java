import java.util.*;
public class SumOfNumber {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int a = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=a){
             sum = sum + i;
             i++;
          
           
        }
          System.out.print(sum);


      }
    
}


