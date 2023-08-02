package org.example;

public class Student extends App{
    private int ID;
    private String name;
    private String city;

    public void setId(int ID){
        this.ID = ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }

    public int getId(){
        return this.ID;
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
    public Student(int ID, String name, String city){
        super();
        this.ID = ID;
        this.city = city;
        this.name = name;
    }
    public void getDetails(){
        System.out.println(this.ID);
        System.out.println(this.name);
        System.out.println(this.city);
    }
}
