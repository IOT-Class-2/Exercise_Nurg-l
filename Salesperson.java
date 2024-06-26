package com.ofis_day2;


public class Salesperson extends Employee { // "extends" Employee salesperson sınıfının Employee sınıfından miras aldığını gösterir
    // "Employee" sınıfından miras adlığını belirtir. Yani 'salesperson' sınıfın tüm özelliklerini aldığını gösterir.
    private double commissionPercentage;

    public Salesperson(String name, double salary, int age, double commissionPercentage) {
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

    public void raiseCommission() { //Komisyon yüzdesi %30 ve altındaysa artırma işlemi döndürür
        if (this.commissionPercentage < .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }

}

