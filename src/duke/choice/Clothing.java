/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author eduardsb
 */
public class Clothing implements Comparable<Clothing> {
    private String description;
    private double price;
    private String size="M";
    public final static double minPrice = 10.0;
    public final static double minTax = 0.2;

    public Clothing(String description, double price, String asize) {
        this.description = description;
        this.price = price;
        size = asize;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price+ minTax);
    }

    public void setPrice(double price) {
        
        
        this.price = (price > minPrice) ? this.price : minPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
        return getDescription() + "," + getSize() + "," + getPrice();
    }
    
    @Override
    public int compareTo(Clothing c){
        return this.description.compareTo(c.description);
    }
    
}
