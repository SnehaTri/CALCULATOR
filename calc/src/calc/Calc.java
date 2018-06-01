/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import java.util.Scanner;

/**
 *
 * @author Inspi
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operations c = new operations();
        Scanner s = new Scanner(System.in);
        double n1, n2, res;
        int ch;
        System.out.println("Enter first number:\n");
        n1 = s.nextDouble();
        System.out.println("Enter second number: \n");
        n2 = s.nextDouble();
        
        System.out.println("1. ADD\n 2. SUBTRACT\n 3. MULTIPLY\n 4. DIVIDE\n 5. EXIT\n");
        System.out.println("Enter your choice: ");
        ch = s.nextInt();
        
        switch(ch){
            case 1: res = c.add(n1, n2);
                    System.out.print(res);
                    
            case 2: res = c.sub(n1, n2);
                    System.out.print(res);
                    
            case 3: res = c.mul(n1, n2);
                    System.out.print(res);
                    
            case 4: res = c.div(n1, n2);
                    System.out.print(res);
                    
            case 5: System.exit(0);
            
            default: System.out.println("You entered wron choice\n");
                    
                    
        }
        
    
    }
}
    
    
    class operations{
    
      public double add(double no1, double no2){
        
        return (no1+no2);
    }
    
    public double sub(double no1, double no2){
        
        return (no1-no2);
    }
    
    public double mul(double no1, double no2){
        
        return (no1*no2);
    }
    
    public double div(double no1, double no2){
        
        return (no1/no2);
    }
}




    
    
        
        
    

