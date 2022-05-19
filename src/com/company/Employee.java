package com.company;

public class Employee {
    private final String firstName;
    private final String secondName;
    private final String lastName;
    private int salary;
    private int department;
    private int id;

    public Employee(String firstName, String secondName, String lastName, int salary, int department, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.id = id;
    }

    public String toString(){
        return "Имя: "+firstName+"\nФамилия: "+secondName+"\nОтчество: "+lastName+"\nЗарплата: "+salary+"\nОтдел: "+department+"\nID: "+id+"\n";
    }
    public String FIO(){
        return "Имя: "+firstName+"\nФамилия: "+secondName+"\nОтчество: "+lastName+"\n";
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getDepartment(){
        return this.department;
    }
    public void setDepartment(int department){
        this.department = department;
    }
    public int getID(){
        return this.id;
    }

}
