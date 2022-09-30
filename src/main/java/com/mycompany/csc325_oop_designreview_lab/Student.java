
package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human{
	// done 1: Make this class a child of Human
	
	// done 2: Fix the resulting errors
	
	// done 3:  a field for GPA and create setter and getter
	
	// done 4: Add comments to your code
    private double credits;
    private Address address;
    private double gpa;
    
    public Student( String name, short age, double credits, Address address, double gpa) { // Made student constructor
        super(name, age);
        this.credits = credits;
        this.address = address;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
    public double getCredits() { // getter method
        return credits;
    }

    public void setCredits(double credits) {// setter method
        this.credits =credits;
    }

    @Override
    public String getAddress() {
        return address+"";
    }

    @Override
    public void setAddress(String address) {
        
    }

    @Override
    public String toString() {
        return  super.toString()+"\n"+ "credits=" + credits + "\n" +" address=" + address + "\n" + " gpa=" + gpa ;
    }
    
    

}