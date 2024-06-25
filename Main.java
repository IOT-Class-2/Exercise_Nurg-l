package com.ofis_day2;

public class Main {
    public static void main(String[] args) {

        Analyst employeeOne = new Analyst("Nurgül Karabulut", 80000, 34);

        Salesperson employeeTwo = new Salesperson("Ceren Çetin", 65000, 32, .25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommissionPercentage());


    }
}
