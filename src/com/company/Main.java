package com.company;

public class Main {

    private static int id = -1;
    private static Employee[] book = new Employee[3];
    public static void main(String[] args) {


	    Employee Gneg0 = new Employee("Gneg", "Johnson", "Junior", 150, 1, idCounter());
        book[0]=Gneg0;
        Employee Gneg1 = new Employee("William", "Shakespear", "Nolastnamovich", 230, 4, idCounter());
        book[1]=Gneg1;
        Employee Gneg2 = new Employee("Gneg", "Johnson", "Blazkovich", 400, 5, idCounter());
        book[2]=Gneg2;

        getBook();
        getMonthSalary();
        getMinSalary();
        getMaxSalary();
        getAverageSalary();
        getFIO();
    }
    public static int idCounter(){
        id++;
        return id;
    }
    public static void getBook(){
        for(int i=0; i<book.length; i++){
                System.out.println(book[i].toString());
        }
    }
    public static void getMonthSalary(){
        int monthSalary = 0;
        for(int i=0; i<book.length; i++){
            monthSalary +=book[i].getSalary();
        }
        System.out.println("Зарплата всех сотрудников за месяц: "+monthSalary+"\n");
    }
    public static void getMinSalary(){
        int minSalary = book[0].getSalary();
        for(int i=0; i<book.length; i++){
            if(book[i].getSalary()<minSalary){
                minSalary=book[i].getSalary();
            }
        }
        System.out.println("Самая маленькая зарплата за месяц: "+minSalary+"\n");
    }
    public static void getMaxSalary(){
        int maxSalary = book[0].getSalary();
        for(int i=0; i<book.length; i++){
            if(book[i].getSalary()>maxSalary){
                maxSalary=book[i].getSalary();
            }
        }
        System.out.println("Самая большая зарплата за месяц: "+maxSalary+"\n");
    }
    public static void getAverageSalary(){
        int monthSalary = 0;
        for(int i=0; i<book.length; i++){
            monthSalary +=book[i].getSalary();
        }
        System.out.println("Средняя зарплата за месяц: "+monthSalary/book.length+"\n");
    }
    public static void getFIO(){
        for(int i=0; i<book.length; i++){
            System.out.println(book[i].FIO());
        }
    }
}


