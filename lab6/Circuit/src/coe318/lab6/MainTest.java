/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author Artheeckkumarran Shanmugalingam
 */
public class MainTest {
    
    public static void main(String[] args) {
        
        Circuit c1 = Circuit.getInstance();
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        Node D = new Node();
    
        Resistor r1 = new Resistor(12.0, A, B);
        Resistor r2 = new Resistor(24.0, B, C);
        Resistor r3 = new Resistor(48.0, C, D);
       
        System.out.println("\nCircuit");
        
        c1.add(r1);
        c1.add(r2);
        c1.add(r3);
        System.out.println(c1.toString());
    }
    
}