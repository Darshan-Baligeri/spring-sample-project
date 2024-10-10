package org.easycom;

public class Dev {
    

    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    //private int age;

    

    /*public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public Dev(){
        System.out.println("Dev Constructor");
    }
    
    public void build(){

        System.out.println("Working in awesome project");
        com.compile();
    }
}
