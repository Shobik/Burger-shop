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
public class OOPMasterChallenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Deluxe","lamb",2.36,"Brown");
//        hamburger.addHamburgerAddition1("Tomato", .25);
//        hamburger.addHamburgerAddition2("Lettuce", .25);
//        hamburger.addHamburgerAddition3("Olives", .25);
//        hamburger.addHamburgerAddition4("Onion", .25);
//        
//        
//        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
//        
//        Healthyburger mcd = new Healthyburger("pork",5.36);
//        mcd.addHamburgerAddition1("Lettuce", .25);
//         mcd.addHamburgerAddition2("Cabbage", .25);
//        mcd.addHamburgerAddition3("Mushroom", .25);
//        mcd.addHamburgerAddition4("Onion", .25);
//        mcd.addHealthyAddition1("Olives", .26);
//        mcd.addHealthyAddition2("Cheese", 1.24);
//        System.out.println("The price of burger is "+ mcd.itemizeHamburger());

          Deluxburger kfc = new Deluxburger("Deluxe","lamb",2.36,"Brown");
          kfc.addHamburgerAddition1("Tomato", .25);
          kfc.addHamburgerAddition2("Lettuce", .25);
          kfc.addHamburgerAddition3("Olives", .25);
          kfc.addHamburgerAddition4("Onion", .25);
          kfc.additionalChips("Lays", .24);
          kfc.additionalDrink("Pepsi", 2.5);
          System.out.println("The final price of delux burger is "+ kfc.itemizeHamburger());
    }
    
}
