package org.example;

public class Student extends App{
    private int id;
    private String name;
    private String city;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public Student(){
        super();
    }
    public Student(int id, String name, String city){
        super();
        this.id = id;
        this.city = city;
        this.name = name;
    }
    public void getDetails(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.city);
    }
}
