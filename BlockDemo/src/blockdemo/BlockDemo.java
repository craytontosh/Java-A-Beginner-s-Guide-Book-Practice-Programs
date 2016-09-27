/*
 * Author - Crayton McIntosh
 * Purpose - demonstrate blocks of code in java syntax
 * Last Modified - 9/27/2016
 */
package blockdemo;
public class BlockDemo {
public static void main(String[] args) {
        //data abstraction    
        double i, j, d; 
        //input 
        i = 5; 
        j = 10; 
        //process and output 
        if (i != 0){
            System.out.println("i does not equal zero");
            d = j/i; 
            System.out.print("j / i is " + d);
        }
    }   
}
