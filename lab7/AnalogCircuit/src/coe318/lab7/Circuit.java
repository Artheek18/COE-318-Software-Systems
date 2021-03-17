/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.ArrayList;
/**
 *
 * @author Artheeckkumarran Shanmugalingam
 */
public class Circuit {
    public ArrayList<Resistor> resistors = new ArrayList<Resistor>();
    public ArrayList<VoltageSource> DCsource = new ArrayList<VoltageSource>();
    private static Circuit instance =  null;
    
   /* private Circuit() {
        this.resistors = new ArrayList<Resistor>();
        this.DCsource = new ArrayList<VoltageSource>();
        
        
     }
    */
    public void addR(Resistor r){
        resistors.add(r);
    }
    
    public void addV(VoltageSource v){
         DCsource.add(v);
    }
           
     public static Circuit getInstance(){
        if(instance == null){
        instance = new Circuit();
        }
        return instance;
    }
    
     
     
     
     public String toString(){ 
        String volt = new String();
        String circuit = new String();
        for(int i=0; i<this.DCsource.size(); i++){
            volt += this.DCsource.get(i).toString() + "\n";
        }
        
        for(int x=0; x<this.resistors.size(); x++){
            circuit += this.resistors.get(x).toString() + "\n";
        }
         
        return(circuit + " " + volt);
    }
     
}
