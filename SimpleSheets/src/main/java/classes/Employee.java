    package main.java.classes;
//imports
    import java.text.SimpleDateFormat;
    import java.util.Date;
    public class Employee extends Person{
    
//Attributes
    private Date hireDate;
    private double salary;
    private String department;
    private double commission;   
//Constructor
    public Employee(int iDNumber, String firstName, String lastName, String phoneNumber, 
    String eMail, Date hireDate, double salary, String department, double commission){
    setiDNumber(iDNumber);
    setFirstName(firstName);
    setLastName(lastName);    
    setPhoneNumber(phoneNumber);
    seteMail(eMail);    
    setHireDate(hireDate);
    setSalary(salary);
    setDepartment(department);
    setCommission(commission);
  }




//Getters and setters
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    }
}