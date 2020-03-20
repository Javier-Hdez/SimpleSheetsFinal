    package main.java;
//imports
    import main.java.classes.Address;
    import java.util.ArrayList;
    import main.java.classes.Product;
    import main.java.classes.Employee;
    import main.java.classes.Customer;
    class Main{
         public static void main(String[] args){
//Addresses
        ArrayList<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address(1, "123 Main St", "", "The Dalles", "OR", 97058));
        addresses.add(new Address(2, "456 Main St", "", "The Dalles", "OR", 97058));
        addresses.add(new Address(3, "789 Main St", "", "The Dalles", "OR", 97058));
        addresses.add(new Address(4, "222 J St", "", "The Dalles", "OR", 97058));
        
        for(Address a : addresses){
        if(a.getAddressID() == 1){
        System.out.println(a.printAddress());
            }
        }
//Products        
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Hammermill Paper", 31.99, 10));
        products.add(new Product(2, "Tru Red Paper", 55.99, 5));
        products.add(new Product(3, "Domtar Paper", 59.29, 15));

        for(Product b : products){
        if(b.getProductID() == 3){
        System.out.println(b.printProduct());
//Customer    
        Customer CustomerOne = new Customer(5, "James", "Jones", "5555555556", "guy1@gmail.com");
        Customer CustomerTwo = new Customer(6, "Brendan", "Shaub", "5417773535", "beeSting@gmail.com");
        Customer CustomerThree = new Customer(7, "Theo", "Von", "11111111", "ratKing@gmail.com");
   
//Employee
    Employee EmployeeOne = new Employee(1, "Jim", "Jackson", "54154154151", "wazzup@gmail.com", 10/27/18, 100000, "Sales", .15);
    Employee EmployeeTwo = new Employee(2, "Tim", "Turner", "1234567890", "dude@gmail.com", 11/12/15, 80000, "Sales", .15);  
    Employee EmployeeThree = new Employee(3, "Elote","Guy", "7676767676","lilGuy@gmail.com", 05/06/07, 60000, "Sales", .15); 
        
        }
}
}    
 
    

}  
   
    