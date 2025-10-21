/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @author lukhanyo Z
 */
public class runMathCalculator {
    public static void main(String[] args) {
        
        Scanner kbd = new Scanner (System.in);
       
        System.out.print("Enter the first number:");
        int num1 = kbd.nextInt();                       // correct
        System.out.print("Enter the second number:");
        int num2 = kbd.nextInt();                       //correct
        
        System.out.println("What would you like to do?");    //correct
        System.out.println("A to add");
        System.out.println("S to subtract");
        System.out.println("M to multiply");
        System.out.println("D to divide");
        
        
        System.out.print("Enter choice:");
        char answer = kbd.next().toUpperCase().charAt(0);        //toUpperCase changes it to uppercase
        
        
       int equation1, equation2, equation3, equation4;
        equation1 = num1 + num2;
        equation2 = num1 - num2;
        equation3 = num1 * num2;
        equation4 = (num1/num2);
              
 
        
    switch (answer){
        case 'A':
             System.out.println(num1 + " plus "+num2+" is " +equation1);
             break;
        case 'S':
             System.out.println(num1 + " minus "+num2+" is "+equation2);
             break;
        case 'M':
            System.out.println(num1 + " multiply by "+num2+" is " +equation3);
            break;
        case 'D': 
            if (num2 == 0 ) {
                System.out.println("cannot devide by zero");
            }else{
                System.out.println(num1 + " divide by "+num2+" is " +equation4); }
            break;
        default:
            System.out.println("INVALID CHOICE");           
        } //END OF SWITCH-CASE
        
        
    }  //END OF MAIN METHOD 
}  // END OF CLASS