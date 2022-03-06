package com.company;
class Student1 {
    int id;
    String name;

    Student1(int i,String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + "" + name);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1(172033,"Sumit");
        Student1 s2 = new Student1(172031,"Sneha");

        s1.display();
        s2.display();

    }
}


