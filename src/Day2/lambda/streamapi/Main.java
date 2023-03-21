/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.lambda.streamapi;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Long Nguyen
 */
public class Main {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("long", "Nam", "An", "Huong", "Nhat");
 
        data.stream() 
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("------Sort------");
         data.stream() 
                .sorted((s1, s2) -> s1.length() - s2.length()) 
                .forEach(System.out::println);
         
        System.out.println("------match------");
         boolean result = data.stream().anyMatch((s) -> s.equalsIgnoreCase("long"));
        System.out.println(result); 
        
        
    }
}
