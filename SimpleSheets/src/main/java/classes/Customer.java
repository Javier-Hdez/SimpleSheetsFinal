    package main.java.classes;
    public class Customer extends Person{

//Attributes
    private Address billingAddress;
    private Address shippingAddress;
    
//inherited attirbutes
    public Customer(int iDNumber, String firstName, String lastName, String phoneNumber, String eMail){
    setiDNumber(iDNumber);
    setFirstName(firstName);
    setLastName(lastName);
    setPhoneNumber(phoneNumber);
    seteMail(eMail);
    }
//Getters and setters
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
}
