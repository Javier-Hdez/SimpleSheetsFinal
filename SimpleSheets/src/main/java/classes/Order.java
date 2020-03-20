    package main.java.classes;
//imports
    import java.util.Date;

    public class Order{
//Attributes
    private Date date;
    private int orderNumber;
    private Customer number;
    private Customer name;
    private Employee ID;
    private String orderStatus;
    private Address billingAddress;
    private Address shippingAddress;
    private double total;
//Constructor
    public Order(Date date, int orderNumber, Customer number, Customer name, Employee ID, 
    String orderStatus, Address billingAddress, Address shippingAddress, double total){
        setDate(date);
        setOrderNumber(orderNumber);
        setNumber(number);
        setName(name);
        setID(ID);
        setOrderStatus(orderStatus);
        setBillingAddress(billingAddress);
        setShippingAddress(shippingAddress);
        setTotal(total);
    }

//Getters and setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getNumber() {
        return number;
    }

    public void setNumber(Customer number) {
        this.number = number;
    }

    public Customer getName() {
        return name;
    }

    public void setName(Customer name) {
        this.name = name;
    }

    public Employee getID() {
        return ID;
    }

    public void setID(Employee iD) {
        ID = iD;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}