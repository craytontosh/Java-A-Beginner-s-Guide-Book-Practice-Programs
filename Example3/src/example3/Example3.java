/*
* Author - Crayton McIntosh
* Purpose - practice using ints and doubles 
* Last Modified - 9/27/2016
*/
package example3;

public class Example3 {
    public static void main(String[] args) {
        int var = 10; 
        double x = 10.0; 
        
        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); //prints a blank line
        
        var = var / 4;
        x = x / 4; 
        
        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }   
}
