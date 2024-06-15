public class EncapsulationClass{
    public static void main(String[] args){
        // Task
        // Make setter and getter for price
        // Create 2 object of Laptop
        // Output the following using the object
        // Output
        // Name : Apple Air M2
        // Brand: Apple
        // Price: 150000
        // Year: 2022
        // Make a function inflation 
        // that takes number and add it to the
        // current price and print the new price
        Laptop l1 = new Laptop();
        l1.setName("Apple Air M2");
        l1.setPrice(150000);
        l1.brand = "Apple";
        l1.year = 2022;
        System.out.println("Name " + l1.getName());
        System.out.println("Brand " + l1.brand);
        System.out.println("Price " + l1.getPrice());
        System.out.println("Year " + l1.year);
        l1.inflation(5000);
        System.out.println("New Price " + l1.getPrice());
    }
}
// 1. Encapsulation bundles the 
// similar attribute and function inside a class
class Laptop{
    // 2. Encapsulation can have data hiding using private properties
    private String name;
    public String brand;
    private double price;
    int year;
    // 3. Encapsulation can have read only or write only 
    // using getter and setter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void getInfo(){
        System.out.println(name + " " + brand);
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void inflation(double money){
        this.price = this.price + money;
    }
}