package org.designpatterns;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }
    //methods
    public void sayHello(){
        System.out.println("Hi,my name is "+name);//combined the value of the name field
    }


}
