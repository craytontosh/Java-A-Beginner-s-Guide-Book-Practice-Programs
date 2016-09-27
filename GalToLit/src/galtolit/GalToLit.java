/*
* Author - Crayton McIntosh
* Purpose - This is a practice program to understand doubles 
            converts gallons to liters
* Last Modified - 9/27/2016
*/
package galtolit;
public class GalToLit {
    public static void main(String[] args) {
        //declaration
        double gallons, liters; 
        //input
        gallons = 10; 
        //process
        liters = gallons * 3.7854; //converts gallons to liters 
        //output
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
