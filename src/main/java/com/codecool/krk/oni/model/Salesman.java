package com.codecool.krk.oni.model;

public class Salesman {
    private Integer id;
    private String name;
    private Integer salary;
    private Integer birthYear;

    public Salesman() {
    }

    public Salesman(Integer id, String name, Integer salary, Integer birthYear) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public Salesman(String name, Integer salary, Integer birthYear) {
        this.name = name;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
}
