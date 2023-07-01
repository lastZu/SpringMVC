package org.lastzu.springmvc.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {
    @Email(message = "It`s not a valid e-mail")
    private String email;
    @Min(value = 1, message = "Age can`t be less then 1")
    private int age;
    private int id;
    @NotEmpty(message = "Name can`t be empty")
    @Size(min = 3, max = 24, message = "Min value - 3, Max value - 24")
    private String name;

    public Person(){}

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
