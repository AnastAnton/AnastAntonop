/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialof10;

/**
 *
 * @author AnastAnton
 */
public class FactorialOf10 {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int x){
        if ( x > 0 ){
            return x *= factorial(x - 1);
        }
        else{ 
            return 1;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(10));
    }
    
}
