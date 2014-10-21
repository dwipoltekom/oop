/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author dwijonarko
 */
public class Hello {
    public String print(String world){
        return "Hello "+world;
    }
    
    public static void main(String[] args) {
        Hello h = new Hello();
        System.out.println(h.print("World"));
    }
}
