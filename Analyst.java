package com.ofis_day2;

public class Analyst extends Employee { //bu sınıfın her yerden erişilebilir olduğunu gösterir
    // "extends" Employee Analyst sınıfının Employee sınıfından miras aldığını gösterir
    // "Employee" sınıfından miras adlığını belirtir. Yani 'Analyst' sınıfın tüm özelliklerini aldığını gösterir.
    public Analyst(String name, double salary, int age) { // bu sınıfın örneği oluşturulurken çağırılan metottur
        super(name, salary, age); /* "Employee" sınıfının yapıcı methodunu çağırır. 'name', 'salary', 'age' parametrelerini
        "Employee" sınıfına iletir */
        // bu sınıfın yapıcı metodunu çağırır
    }
    //Constracture ====> Yapıcı Method
    public double getAnnualBonus() { // Analystin yıllık bonusunu hesaplayan metottur ve bu metodu döndürür
        return super.salary * .05;
        // bu metod Employee sınıfından alınan maaş değişkenine erişir
        // super anahtar kelimesiyle bu erişimi sağlar
        // methodun genel işlevi ise maaşını %5ini hesaplar ve döndürür. Bu analystin yıllık bonusunu gösterir
    }
}

