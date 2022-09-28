
package com.mycompany.csc325_oop_designreview_lab;

public abstract class Student extends Human{
	// done 1: Make this class a child of Human
	
	// done 2: Fix the resulting errors
	
	// done 3:  a field for GPA and create setter and getter
	
	// done 4: Add comments to your code
    private double credits;

    public Student( String name, short age, double credits) { // Made student constructor
        super(name, age);
        this.credits = credits;
    }

    public double getCredits() { // getter method
        return credits;
    }

    public void setCredits(double credits) {// setter method
        this.credits =credits;
    }
    
    

}