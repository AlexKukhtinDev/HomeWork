package com.kukhtin;

import java.util.HashMap;
import java.util.Map;

public class HomeworkDemo {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .name("Alex")
                .surname("Cooper")
                .age(32)
                .height(165)
                .weight(70)
                .build();

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "first");
        hashMap.put("2", "second");

        String string = "original";

        int i = 10;

        Immutable immutable = new Immutable(i, string, hashMap);

        System.out.println(string == immutable.getName());
        System.out.println(hashMap == immutable.getTestMap());

        System.out.println("Immutable id:" + immutable.getId());
        System.out.println("Immutable name:" + immutable.getName());
        System.out.println("Immutable testMap:" + immutable.getTestMap());

        i = 20;
        string = "modified";
        hashMap.put("3", "third");

        System.out.println("Immutable id after local variable change:" + immutable.getId());
        System.out.println("Immutable name after local variable change:" + immutable.getName());
        System.out.println("Immutable testMap after local variable change:" + immutable.getTestMap());
        Map<String, String> hmTest = immutable.getTestMap();
        hmTest.put("4", "new");
    }
}
