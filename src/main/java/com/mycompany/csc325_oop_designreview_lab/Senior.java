/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    
    private double credits = 86.0;

    public Senior(String name, short age, double credits, Address address, double gpa) {
        super(name, age, credits, address, gpa);
        credits = this.credits;
    }

    @Override
    public String toString() {
        return  (super.toString() +"\n"+ "credits=" + credits) + '}';
    }
    
    

   
    
    
    
}
