/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.interfaces;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Long Nguyen
 */
public class Main {
    public static void main(String[] args) {
        
        Map<Integer, News> listNews = new  HashMap<>();
        listNews.put(1, new News("Tin tức 1","Rosie Nguyen", "2023", "abcd"));
        listNews.put(2, new News("Tin tức 2", "Rocker Nguyen", "2019", "abcd"));
        listNews.put(3, new News("Tin tức 3", "Martin Nguyen", "2018", "abcd"));
        
        
        
        for (Map.Entry<Integer, News> entry : listNews.entrySet()) {
            System.out.println("ID: " + entry.getKey()+"");
            entry.getValue().display();
        }
        
    }
    
}
