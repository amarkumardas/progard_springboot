package com.example.EmployeeSpringBoot;

public class Employee {
    public String getName() {
        return name;
    }

    public Employee(String name, String age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String name;
    private String age;
    private String city;
}
