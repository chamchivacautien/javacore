/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.generic;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Long Nguyen
 */
public class Main {

    public static void main(String[] args) {
        Stack<Student> st = new Stack<>();
        st.push(new Student(1, "long"));
        st.push(new Student(2, "nam"));
        System.out.println(st.pop());
        st.traverse();
        
        
        
        
//        List< Integer> listInt = Arrays.asList(10, 40, 50, 60);
//        List< Double> listDouble = Arrays.asList(12.7, 19.5, 167.8, 433.7);
//        printList(listInt);
//        printList(listDouble);
    }

    private static void printList(List<?> list) {

        System.out.println(list);

    }
}
