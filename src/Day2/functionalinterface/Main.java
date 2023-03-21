/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.functionalinterface;

/**
 *
 * @author Long Nguyen
 */
public class Main {
   
    
    public static void main(String[] args) {
         Exam1 fi = (String str)->str.length();
        String name = "Long";
        int lengthString = fi.getStringLength(name);
        System.out.println(lengthString);
        
        
        Exam2 f1 = (int a, int b)-> (a+b);
        System.out.println(f1.getsum(1, 2)); 
        
    }
    
}


@FunctionalInterface
interface Exam1 {
  int getStringLength(String str);
  
}
@FunctionalInterface
interface Exam2 {
  int getsum(int a, int b);
  
}
