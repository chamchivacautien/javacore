/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.abstracts;


import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Long Nguyen
 */
public class Main {
    public static void main(String[] args) {
        
        Set<Employee> em = new HashSet<>();
        
        em.add(new FulltimeEmployee(1, "long", 30));
        em.add(new ParttimeEmployee(2, "nam", 35, 4));
        em.add(new FulltimeEmployee(3, "cuong", 40));
        em.add(new ParttimeEmployee(4, "linh", 50, 5));
        
        em.forEach(employee-> employee.displayInfo());
        
        
        
    }
}
