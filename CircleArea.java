// we are finding area of circle
import java.util.*;
public class CircleArea {
    public static void main(String args[]) {
       try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the value of radius :");
        double r = sc.nextDouble();
        double p = 3.14;
        double area = r*r*p;
        System.out.println("area of a Circle :" + area);
       }

    }

    
}
