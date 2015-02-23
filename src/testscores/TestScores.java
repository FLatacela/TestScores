/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testscores;

/**
 *
 * @author class
 */
public class TestScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare and initalize test scores as int
        int first_test=90;
        int second_test=90;
        int third_test=89;
       
        System.out.println("The Score of test 1 is: "+ first_test);
        System.out.println("The Score of test 2 is: "+ second_test);
        System.out.println("The Score of test 3 is: "+ third_test);
        
        
        
        // calculate the average of the test scores  
        double average;
        average= (first_test + second_test + third_test)/3.0;
       
        System.out.println("The average test score is: "+ average);
                
                
             
    }
    
}
