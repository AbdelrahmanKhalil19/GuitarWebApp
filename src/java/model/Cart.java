/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author compu zone
 */
public class Cart {
    String Username;
    long ResetNumber;
    int quantity;
    int price;
    String creditCard;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Cart() {
    }

    public Cart(String Username, long ResetNumber, int quantity, int price, String creditCard) {
        this.Username = Username;
        this.ResetNumber = ResetNumber;
        this.quantity = quantity;
        this.price = price;
        this.creditCard = creditCard;
    }

    

    

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public long getResetNumber() {
        return ResetNumber;
    }

    public void setResetNumber(long ResetNumber) {
        this.ResetNumber = ResetNumber;
    }
    
    
}
