package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // done 5: Fix the error
        // done6: Fix the constructor of Student class
        // done 7: Create two classes for Freshman and Senior 
        // ToDo 8: The senior class should have a minimum of 85 credits  
        // done 9: Add a toString method for Freshman class
        // done 10: Add a toString method for Senior class
        short sh1 = 20;
        String ad = ("11th st railRoad 11779 ronkonkoma ny");//address instanciation
        Student s2 = new Freshman("James", sh1, 12.0,  3.5);// name, age, credits
        Freshman std1 = (Freshman) s2; // converted student to freshman
        short sh2 = 20;
        String ad2 = "7th st railRoad 11779 ronkonkoma ny";
        Student s = new Senior("John", sh2, 90.0, 3.6);//converted senior to student
        Senior std2 = (Senior) s;   //converted student to senior;

        System.out.println(std1);

        System.out.println(std2);
        // done 11: Set the gpa of the student using the scanner and user
        // 			input and then print the output.
        System.err.println("enter input: ");
        Scanner input = new Scanner(System.in);
        double gpa = Double.parseDouble( input.nextLine()); // user input
        std1.setGpa(gpa);
                
         System.out.println("after input: \n" + std1);
        // ToDo 12: add comments and explain your code
        // ToDo 13: submit using a pull request.
    }

}
