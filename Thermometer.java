import java.util.*;
public class Thermometer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tempreature that the patient have :- ");
        double a = sc.nextDouble();
        if ( a <= 96.8){
            System.out.print("Patient is normal");
        }
        else if (100 >= a  && a >= 96.8){
            System.out.print("The person have feverr ");

        }
        else {
            System.out.print("The person is dead");
        }
    }
    
}

