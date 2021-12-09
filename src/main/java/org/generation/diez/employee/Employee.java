package org.generation.diez.employee;

// Plain Old Java Object -- POJO
//Empleado

public class Employee {
    private String name;
    private String lastName;
    private String email;
    private int age;
    private String rfc;
    private String address;
    private double salary;
    private String department;

    public Employee(String name, String lastName, String email, int age,
                    String rfc, String address, double salary, String department) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.rfc = rfc;
        this.address = address;
        this.salary = salary;
        this.department = department;
    } //constructor

    public String getName() {
        return name;
    }//getName

    public void setName(String name) {
        this.name = name;
    }//setName

    public String getLastName() {
        return lastName;
    }//getLastName

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//setLastName

    public String getEmail() {
        return email;
    }//getEmail

    public void setEmail(String email) {
        this.email = email;
    }//setEmail

    public int getAge() {
        return age;
    }//getAge

    public void setAge(int age) {
        this.age = age;
    }//setAge

    public String getRfc() {
        return rfc;
    }//getRfc

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }//setRfc

    public String getAddress() {
        return address;
    }//getAddress

    public void setAddress(String address) {
        this.address = address;
    }//setAddress

    public double getSalary() {
        return salary;
    }//getSalary

    public void setSalary(double salary) {
        this.salary = salary;
    }//setSalary

    public String getDepartment() {
        return department;
    }//getDepartment

    public void setDepartment(String department) {
        this.department = department;
    }//setDepartment

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", rfc='" + rfc + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }//toString

}// class Employee
