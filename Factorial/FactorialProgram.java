/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialprogram;

/**
 *
 * @author g
 */
public class FactorialProgram {
   public long Calcfactorial(int j){
       
    long num =1;
        for(long i=j;i>0;i--){
          
          num*=i;}
      
        return num;
    
}
   
    public static void main(String [] args) {
    FactorialProgram fac1 =new FactorialProgram();
   long Factorial =fac1.Calcfactorial(20);
   System.out.println("Factorial is "+ Factorial);
}}
