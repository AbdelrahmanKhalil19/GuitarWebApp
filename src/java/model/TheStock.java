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
public class TheStock 
{
    String pname;
    String IDp;
    String category;
    String descripton;
    String price;
    
    public TheStock()
    {
        
        this.pname = null;
        this.IDp = null;
        this.category = null;
        this.descripton = null;
        this.price = null;
    }

    public TheStock(String pname, String IDp, String category, String descripton, String price) {
        this.pname = pname;
        this.IDp = IDp;
        this.category = category;
        this.descripton = descripton;
        this.price = price;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getIDp() {
        return IDp;
    }

    public void setIDp(String IDp) {
        this.IDp = IDp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
