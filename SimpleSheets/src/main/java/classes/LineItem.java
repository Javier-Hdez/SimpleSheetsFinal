    package main.java.classes;

    public class LineItem{
//Attributes
    private int quantity;
    private Product product;
    private int cost;
//Construcor
    public LineItem(int quantity, Product product, int cost){
        setQuantity(quantity);
        setProduct(product);
        setCost(cost);


    }
//Getters and setters
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    /* public void calcTotal(){
        setLnTotal(getCost()*getQuantity());
    } */
}