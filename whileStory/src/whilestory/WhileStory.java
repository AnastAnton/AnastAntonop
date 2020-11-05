/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilestory;

/**
 *
 * @author user
 */
public class WhileStory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double x = 3000;
        while(x > 0.5){
            System.out.println(x);
            x = x / 2;
        }
    }
    
}
