package com.kukhtin;

public class HomeworkDemo {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .Name("Alex")
                .Surname("Cooper")
                .Age(32)
                .Height(165)
                .Weight(70)
                .build();
    }
}
