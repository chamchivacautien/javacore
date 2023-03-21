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
public abstract class Employee {
    private int ID;
    private String name;
    private int paymentPerHour;

    public Employee(int ID, String name, int paymentPerHour) {
        this.ID = ID;
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    
    
    public abstract float calculateSalary();
    
    public abstract void displayInfo();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }


    
    
}
