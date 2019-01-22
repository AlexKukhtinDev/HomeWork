package com.kukhtin;

import java.util.Set;

class Person {
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

        public Builder Name(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder Surname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder Age(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder Height(int height) {
            newPerson.height = height;
            return this;
        }

        public Builder Weight(int weight) {
            newPerson.weight = weight;
            return this;
        }

        public Builder Parents(Set<Person> parents) {
            newPerson.parents = parents;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }
}
