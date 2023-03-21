/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.generic;

/**
 *
 * @author Long Nguyen
 */
public class Student {
    private int ID;
    private String name;

    public Student() {
    }

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", name=" + name + '}';
    }
    
}
