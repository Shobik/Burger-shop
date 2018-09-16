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
public class Deluxburger extends Hamburger{
    private String Chips;
    private double chipsPrice;
    private String drink;
    private double drinkPrice;

    public Deluxburger( String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
        
    }
    
public void additionalChips(String name, double price){
    this.Chips= name;
    this.chipsPrice=price;
}

public void additionalDrink(String name, double price){
    this.drink= name;
    this.drinkPrice= price;
}

    @Override
    public double itemizeHamburger() {
        double HamburgergetPrice = super.itemizeHamburger();
        if(this.Chips !=null){
            HamburgergetPrice += this.chipsPrice;
            System.out.println(this.Chips+" added for "+this.chipsPrice);
        }
        if(this.drink != null){
        HamburgergetPrice += this.drinkPrice;
            System.out.println(this.drink+" added for "+this.drinkPrice);
    }
        return HamburgergetPrice;
    }

    

}
