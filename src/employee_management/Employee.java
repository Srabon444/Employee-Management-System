package employee_management;
import java.awt.*;
import javax.swing.*;

public class Employee {

    String name;
    public String getPhone_num() {
        return phone_num;
    }

    public String getEmail_add() {
        return Email_add;
    }

    public String getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public void setEmail_add(String Email_add) {
        this.Email_add = Email_add;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    String designation;
    String phone_num;
    String Email_add;
    String salary;
    
//    public Employee(String n,String d,int p,String E,double s)
//    {
//        name=n;
//        designation=d;
//        phone_num=p;
//        Email_add=E;
//        salary=s;
//    }
    
    public String getName()
    {
        return name;
    }
    public String getDesignation()
    {
        return designation;
    }
    public String PhoneNumber()
    {
        return phone_num;
    }
    public String EmailAdd()
    {
        return Email_add;
    }
    public String Salary()
    {
        return salary;
    }
     
    
} 
