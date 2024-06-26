package com.ofis_day2;

public class Employee { //bu sınıfın her yerden erişilebilir olduğunu gösterir
    private String name; // private bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu gösterir
    protected double salary; //bu değişkene aynı paket içeirisinden veya alt sınıflardan erişilebilir
    private int age;

    public Employee(String name, double salary, int age) { //bu sınıfın bir örneğini oluştururken çağırılan metottur
        this.name = name; //"name" parametesini sınıfın 'name' değişkenine atar
        this.salary = salary; // "salary" parametresini sınıfın 'salary' değişkenine atar
        this.age = age; // "age" parametresini sınıfın 'age' değişkenine atar

    }
    // Getter ve Setter metotları: Bu metotdlar özel ddeğişkenlerin değerlerini başka sınıflara vermek için kullanılır

    public String getname() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary() { // çalışanın maaşını artıran method
        this.salary = this.salary * 1.2; // %20 değerinde maaşı artırır.
    }
}
