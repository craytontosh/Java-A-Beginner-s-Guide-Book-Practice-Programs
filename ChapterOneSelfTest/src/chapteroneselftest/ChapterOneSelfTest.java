/*
 * Author - Crayton McIntosh
 * Purpose - Finish example problems from the chapter self test section
 * Last Modified - 9/29/2016
 */
package chapteroneselftest;
public class ChapterOneSelfTest {
    public static void main(String[] args) {
        //Moon Gravity Method output
        System.out.println("My weight on the moon is: " + 
                        (String.format( "%.2f", moonGravity())) + " lbs");
        //second Ch1 Self Test program
        //data abstraction and partial input
        double inches, meters;
        int counter = 0; 
        //additional input, process and output
        for(inches = 0; inches <= 144; inches++){
            meters = inches / 39.37;
            System.out.println(inches + " inches is " + 
                    (String.format("%.3f", meters)) + " meters");
            
            //every 12 inches skip a line
            if(counter != 0){
                if(counter % 12 == 0){
                    System.out.println();
                }
            }
            counter++; 
        }
    }
    
    //I haven't learned methods yet, but I am working on early practice with them
    //This method is calculating my weight based on the gravity on the moon
    public static double moonGravity(){
        //data abstraction and input
        int myWeight = 150; 
        double gravity, moonWeight;
        gravity = .17;
        //process and output 
        return moonWeight = myWeight * gravity; 
    }
}
