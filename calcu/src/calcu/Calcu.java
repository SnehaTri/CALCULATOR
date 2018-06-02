/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;
import java.util.Scanner;

/**
 * Main class displays the menu to the user and reads two numbers from the user.
 * It also makes calls to the appropriate methods of class Calculator based upon the menu option selected by user.
 * @param args the command line arguments
 * @author snehila
 */
class Calcu
{
     public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        float number1,number2;
        int choice;
        operations c1=new operations();
        System.out.println("Enter two numbers");
        number1=s.nextFloat();
        number2=s.nextFloat();
        System.out.println("Enter your choice\n");
        System.out.println("1:Add\n");
        System.out.println("2:Subtract\n");
        System.out.println("3:Multiply\n");
        System.out.println("4:Divide\n");
        choice=s.nextInt();
        
        switch(choice)
        {
            case 1:System.out.print(c1.add(number1,number2));
                   break;
            case 2:System.out.print(c1.sub(number1,number2));
                   break;
            case 3:System.out.print(c1.mul(number1,number2));
                   break;
            case 4:if(number2==0)
                    System.out.println("Cannot divide by zero\n");
                    else
                    System.out.print(c1.div(number1,number2));
                    break;
            default:System.out.println("You entered an invalid choice\n");
        }
    }
}

/**
 *
 * @author Inspi
 */
class operations {
    
    
    /**
     * Adds two floating point numbers
     * @param number1 First operand
     * @param number2 Second operand
     * @return Result of addition of two parameter values
     */
    float add(float number1,float number2)
    {
        return (number1+number2);
    }
    
    /**
     * Subtracts two floating point numbers
     * @param number1 First operand
     * @param number2 Second operand
     * @return Result of subtraction of two parameter values
     */
     float sub(float number1,float number2)
    {
        return (number1-number2);
    }
     
     /**
     * Multiplies two floating point numbers
     * @param number1 First operand
     * @param number2 Second operand
     * @return Result of multiplication of two parameter values
     */
      float mul(float number1,float number2)
    {
        return (number1*number2);
    }
      
      /**
     * Divides two floating point numbers
     * @param number1 First operand
     * @param number2 Second operand
     * @return Result of division of two parameter values
     */
       float div(float number1,float number2)
    {
        if(number2 == 0)
            throw new ArithmeticException();
        
            return (number1/number2);
        
    }

}
