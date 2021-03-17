/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author Artheeckkumarran Shanmugalingam
 */
public class VoltageSource {
       // Instance variables
    public double voltage;
    public Node node1, node2;
    public int voltId;
    private static int volt_count = 1;
    
    // Constructor
    public VoltageSource(double voltage, Node node1, Node node2){
        
        // this deals with invalid exceptions 
      
        
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("The connecting nodes must both exist. (Null Error)");}
        
        this.voltage = voltage;
        this.node1 = node1;
        this.node2 = node2;
        this.voltId = volt_count; // Assign unique ID for each voltage source 
        volt_count++; // Increment the id number by 1 
    }
    
    /*
    Get nodes method, return an array of connected nodes
    */
    
    public Node[] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
    }
    
    /*
    toString method, returns the voltage source in a string format
    */
    @Override
    public String toString(){
        return("V"+voltId + " " + node1 + " " + node2 + " " + voltage);
    }
    
}

