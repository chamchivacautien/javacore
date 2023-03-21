/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.generic;

import java.util.LinkedList;

/**
 *
 * @author Long Nguyen
 */
public class Stack<T> {
    private LinkedList<T> list;
    
    
    public Stack(){
        list = new LinkedList<>();
    }
    
    public boolean isEmpty(){
        if(this.list.size()==0){
            return true;
        }
        return false;
    }
    public void push(T item){
        list.addFirst(item);
    }
    public T pop(){
        if(isEmpty()) return null;
        T temp = list.getFirst();
        list.removeFirst();
        return temp;
    }
    public T top(){
        if(isEmpty()) return null;
        return list.getFirst();
    }
    public void traverse(){
        if(isEmpty()){
            System.out.println("danh sach ko co phan tu");
            return;
        }
        for (T t : list) {
            System.out.println("danh sach phan tu la:");
            System.out.println(t.toString());
        }
        
        
    }
}
