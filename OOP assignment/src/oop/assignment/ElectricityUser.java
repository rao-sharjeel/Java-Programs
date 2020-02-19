/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.assignment;

 
public class ElectricityUser {
    String name, address;
    double previous_meter_reading, current_meter_reading;
    int number;
    double this_months_reading;
    double bill;
    
    public ElectricityUser(String n, int num, String ad, double pre, double current)
    {
        name = n;
        number = num;
        address = ad;
        previous_meter_reading = pre;
        current_meter_reading = current;
        this_months_reading = current_meter_reading - previous_meter_reading;
    }
    
    public double calculate_bill()
    {
        if(this_months_reading <= 100)
            bill = this_months_reading * 15;
        else if(this_months_reading > 100 && this_months_reading <= 300)
            bill = 1500 + (this_months_reading - 100) * 30;
         else if(this_months_reading > 300 && this_months_reading <= 500)
            bill = 1500 + 6000 + (this_months_reading - 300) * 45;
        else
             bill = 1500 + 6000 + 9000 + (this_months_reading -500) * 60;
        return bill;
    }
    
    public double show_bill()
    {
        calculate_bill();
        System.out.println("------------------------------------------");
        System.out.println("Customer's Name : " + name);
        System.out.println("Customer's Number : " + number);
        System.out.println("Customer's Address : " + address);
        System.out.println("Customer's total units : " + this_months_reading);
        System.out.println("Customer's Bill : Rs." + bill);
        System.out.println("------------------------------------------");
        return bill;
    }
    
    
}
