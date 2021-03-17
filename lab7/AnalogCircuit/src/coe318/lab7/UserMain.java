/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Artheeckkumaran Shanmugalingam
 */
public class UserMain implements UserInterFace{
    
    String input;
    
    //instance variables used
    ArrayList <Object> elementCir = new  ArrayList<>();
    Scanner in = new Scanner(System.in);
    
    //this defines the start program from the interface
    public void start() {
        
       display();
       run();
        
    }
    
    //displays the instructions for the user 
    public void display(){
        System.out.println("Enter the elements of the circuit: ");
        
    }
    
    //the run method using user input to perform a task
    public void run(){
        while(true){
            input = in.nextLine();
            if(input.equalsIgnoreCase("end")) 
            {
                end();
                break;
            }
            else if(input.equalsIgnoreCase("spice"))
            {
                spice();
            }
            else
            {
                String[] value = input.split(" ");
                if(value.length != 4)
                {
                    System.out.println("Please review the format of your inputs");
                }
                else
                {
                    if(input.toLowerCase().startsWith("v"))
                    {
                        double sub;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.nodeId = Integer.parseInt(value[1]);
                        n2.nodeId = Integer.parseInt(value[2]);
                        sub = Double.parseDouble(value[3]);
                        VoltageSource v = new VoltageSource(sub, n1, n2);
                        elementCir.add(v);
                    }
                    else if (input.toLowerCase().startsWith("r"))
                    {
                       double sub;
                       Node n1 = new Node();
                       Node n2 = new Node();
                       n1.nodeId = Integer.parseInt(value[1]);
                       n2.nodeId = Integer.parseInt(value[2]);
                       sub = Double.parseDouble(value[3]);
                        Resistor r = new Resistor(sub, n1, n2);
                       elementCir.add(r);                              
                    }
                }
            }
            
        }
        
    }
    
    //prints out the spice desccription of the circut
    public void spice(){
        for(Object o : elementCir)
       {
           System.out.println(o);
       }
        
    }
    
    //prints out All done and terminates the program
    public void end()
   {
       System.out.println("All done");
   }
   
    public static void main(String[] args)
   {
       UserMain circ = new UserMain();
       circ.start();
   }
    
    
  
    
}

    