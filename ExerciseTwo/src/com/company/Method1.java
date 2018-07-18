package com.company;

public class Method1 {

    String name1;
    int age1;
    double salary1;

    public static void main(String[] args) {
    }

}

class MemberVariable {
    public static String main(String[] args) {
        Member obj=new Member();

        obj.name1="Harry Potter";
        obj.age1=30;
        obj.salary1=2500.3;

        return "Members Name: "+obj.name1+" Members Age: "+obj.age1+" Members Salary: "+obj.salary1;
    }
}
