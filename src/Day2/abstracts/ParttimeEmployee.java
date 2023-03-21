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
public class ParttimeEmployee extends Employee{
    private int workingHour;

    public ParttimeEmployee(int ID, String name, int paymentPerHour) {
        super(ID, name, paymentPerHour);
    }

    public ParttimeEmployee(int ID, String name, int paymentPerHour, int workingHour) {
        super(ID, name, paymentPerHour);
        this.workingHour = workingHour;
    }
    

    

    @Override
    public float calculateSalary() {
        return this.workingHour*getPaymentPerHour();
    }

    @Override
    public void displayInfo() {
        System.out.println("PartTimeEmployee -> ID: "+getID()+" Name: "+getName()+" Salary: "+calculateSalary());
    }
    
}
