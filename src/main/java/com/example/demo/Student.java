package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Student {

    @Id
    private int id;
    @NotBlank
    private String name;
    @Min(1)
    private int age;
    @NotBlank
    private String city;

    public Student(){

    }

    public Student(int id, String name, int age, String city){
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
}
