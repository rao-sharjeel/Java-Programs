package oop.assignment;
//import RandomNumbers;
import java.util.Scanner;  

public class OOPAssignment {
     
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       Odometer trip1 = new Odometer(13, 9);
       double gallons = trip1.get_gallons();
       
        System.out.println("///////////SAMPLE RUN////////");
       
        System.out.println("------------------------");
        System.out.printf("Fuel consumed in Gallons is : %3.2f\n", gallons);
       
       trip1.reset_miles();
       trip1.add_miles(40);
       trip1.set_efficiency(80);
       gallons = trip1.get_gallons();
      
        System.out.println("------------------------");
        System.out.printf("Fuel consumed in Gallons is : %3.2f\n", gallons);
        
        System.out.println("/////////////////////////////////////////////");
        
        System.out.println("Enter Miles Driven : ");
        double miles = input.nextDouble();
        
        System.out.println("Enter Miles Driven : ");
        double efficiency = input.nextDouble();
        
        Odometer trip2 = new Odometer(miles, efficiency);
        gallons = trip2.get_gallons();
        System.out.printf("Fuel consumed in Gallons is : %3.2f\n", gallons);
    }
    
}