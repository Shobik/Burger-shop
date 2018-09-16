/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.master.challenge1;

/**
 *
 * @author DELL
 */
public class Healthyburger extends Hamburger {
    
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public Healthyburger( String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
        
        
            
            
    }  

    public void addHealthyAddition1(String name, double price) {
        
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    
    public void addHealthyAddition2(String name, double price) {
        
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double HamburgergetPrice =  super.itemizeHamburger(); //To change body of generated methods, choose Tools | Templates.
    if(this.healthyExtra1Name != null){
        HamburgergetPrice +=this.healthyExtra1Price;
        System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
    }
    if(this.healthyExtra2Name != null){
        HamburgergetPrice +=this.healthyExtra2Price;
        System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
    }
    return HamburgergetPrice;
}
}
    
    

   
    

