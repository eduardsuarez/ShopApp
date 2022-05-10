/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.util.Arrays;

/**
 *
 * @author eduardsb
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer cl = new Customer("Pinky", 14);
        //cl.setName("Pinky");
        //cl.setSize("S");

        System.out.println("MIn price: " + Clothing.minPrice);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

//        System.out.println("Item 1" + "," + item1.description + "," +
//                item1.price + "," + item1.size);
//        System.out.println("Item 2" + "," + item2.description + "," +
//                item2.price + "," + item2.size);
//        
        //total = (item1.price + item2.price*2) * (1 + tax);
        int measurement = 8;
        cl.addItems(items);

        //cl.setSize(measurement);
        System.out.println("Customer is: " + cl.getName() + ", " + cl.getSize() + "," + cl.getTotalClothingCost());
        for (Clothing item : cl.getItems()) {
            //System.out.println("Items: " + item.getDescription() + "," + item.getSize() + "," + item.getPrice());
            System.out.println("item Output: " + item);
        }

        int average = 0;
        int count = 0;

        for (Clothing item : cl.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();

            }

        }
        
        try {
            average = (count == 0) ? 0: average/count;
            average = average/count;
        System.out.println("Average price is: " + average + ", Count: " + count);
        } catch(ArithmeticException e){
            System.out.println("No se divide por 0");
        }
        
        Arrays.sort(cl.getItems());
        
        for (Clothing item : cl.getItems()) {
            //System.out.println("Items: " + item.getDescription() + "," + item.getSize() + "," + item.getPrice());
            System.out.println("item Output: " + item);
        }
        
    }

}
