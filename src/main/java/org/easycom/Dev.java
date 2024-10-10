package org.easycom;

public class Dev {

    //private Laptop laptop;

    private int age;

    public Dev(int age) {
        this.age = age;
        System.out.println("Parameterized constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev(){
        System.out.println("Dev Constructor");
    }
    
    public void build(){

        System.out.println("Working in awesome project");
        //laptop.compile();
    }
}
