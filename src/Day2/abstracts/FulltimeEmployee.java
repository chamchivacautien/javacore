/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.abstracts;

/**
 *
 * @author Long Nguyen
 */
public class FulltimeEmployee extends Employee{

    
    

    public FulltimeEmployee(int ID, String name, int paymentPerHour) {
        super(ID, name, paymentPerHour);
    }

   
   
    

    @Override
    public float calculateSalary() {
        return 8*getPaymentPerHour();
    }

    @Override
    public void displayInfo() {
        System.out.println("FullTimeEmployee -> ID: "+getID()+" Name: "+getName()+" Salary: "+calculateSalary()); 
    }
}
