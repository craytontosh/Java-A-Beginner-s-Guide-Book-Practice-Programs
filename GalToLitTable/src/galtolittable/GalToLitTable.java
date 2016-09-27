/*
 * Author - Crayton 
 * Purpose - convert gallons to liters using more decision making techniques 
 * Last Modified - 9/27/2016
 */
package galtolittable;
public class GalToLitTable {
    public static void main(String[] args) {
        //data abstraction
        double gallons, liters; 
        int counter = 0;
        //input, process and output
        for(gallons = 1; gallons <= 100; gallons++){
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");
            counter++;
            //every 10th line print a blank line
            if(counter % 10 == 0){
                System.out.println();
            }
        }
    }
}
