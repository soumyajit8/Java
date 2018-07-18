package com.company;

public class MemberVariable {

    public static void main(String[] args) {
        Member harry = new Member();
        harry.setName("Harry Potter");
        harry.setAge(22);
        harry.setSalary(2500.3);

        System.out.println("Member's name:" + harry.getName());
        System.out.println("Member's age:"+harry.getAge());
        System.out.println("Member's salary:"+harry.getSalary());

    }
}
