/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author rizalhimself
 */
public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;
        
        //konjungsi (and)
        c = a && b;
        System.out.println("true && false = " +c);
        
        //disjungsi (not)
        c = a || b;
        System.out.println("true || false = "+c);
        
        //negasi
        c = a != b;
        System.out.println("true != false = "+c);
        
    }
    
}
