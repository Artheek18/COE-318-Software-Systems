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
public class Node {
    //Instance variables
    public int nodeId;
    private static int nodeCounter = 0; 
    
    // Contructor
    public Node(){
       this.nodeId = nodeCounter;
       nodeCounter++;
    }
    
    /* 
    Return the String representation of the node
    */
    @Override
    public String toString(){
        return("" + this.nodeId);
    }
    
   } 