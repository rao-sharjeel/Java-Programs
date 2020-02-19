/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.assignment;
import java.util.Scanner;  

public class OOPAssignment {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name, address;
        double previous_meter_reading = 1, current_meter_reading = 0;
        int number;
        
        System.out.println("Enter cutomer's Name: ");
        name = input.nextLine();
        
        System.out.println("Enter cutomer's address: ");
        address = input.nextLine();
        
        System.out.println("Enter cutomer's number: ");
        number = input.nextInt();
        
        while(current_meter_reading < previous_meter_reading)
        {
            System.out.println("Enter cutomer's previous reading: ");
            previous_meter_reading = input.nextDouble();

            System.out.println("Enter cutomer's current months reading: ");
            current_meter_reading = input.nextDouble();

            if(current_meter_reading < previous_meter_reading)
                    System.out.println("previous reading can't be smaller than current");
        }
            
        
        ElectricityUser customer1 = new ElectricityUser(name, number, address, previous_meter_reading, current_meter_reading);
        customer1.show_bill();
    }
    
}
