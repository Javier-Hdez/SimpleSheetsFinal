    package main.java.classes;

    public class Product{
// attributes (OH = On Hand)
    private String name; 
    private double price;
    private int quantityOH;
    private double total;
    private int productID;
//Constructor
    public Product(int productID, String name, double price, double total){
    setProductID(productID);
    setName(name);
    setPrice(price);
    setTotal(total);
    }

//Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOH() {
        return quantityOH;
    }

    public void setQuantityOH(int quantityOH) {
        this.quantityOH = quantityOH;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
    public String printProduct(){
       
//StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append(productID + ", " + name + ", " + price + ", " + total);
    
        return sb.toString();
    }


}