package com.kukhtin;

import java.util.Set;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double height;
    private double weight;
    private Set<Person> parents;

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder name(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder surname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder age(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder height(int height) {
            newPerson.height = height;
            return this;
        }

        public Builder weight(int weight) {
            newPerson.weight = weight;
            return this;
        }

        public Builder parents(Set<Person> parents) {
            newPerson.parents = parents;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }
}
