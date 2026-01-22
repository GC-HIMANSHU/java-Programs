import java.util.*;
public class SkipMultiplicationOften {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the number");
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("you've enter the mulyiple of ten");
                continue ;
            }
            System.out.println("number was"+n);
        }while(true);

    }

    
}

