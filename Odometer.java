/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.assignment;


public class Odometer {
    private double miles_driven;
    private double efficiency;
    private double gallons;
    
    public Odometer(double m, double e)
    {
        miles_driven = m;
        efficiency = e;
    }
    
    public void reset_miles()
    {
        miles_driven = 0;
        efficiency = 0;
    }
    public void set_efficiency(double e)
    {
        efficiency = e;
    }
    public void add_miles(double miles)
    {
        miles_driven += miles;
    }
    public double get_gallons()
    {
        gallons = miles_driven / efficiency;
        return gallons;
    }
    
    
    
}
