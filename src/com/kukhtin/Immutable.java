package com.kukhtin;

import java.util.HashMap;
import java.util.Map;

public final class Immutable {
    private final int id;
    private final String name;
    private final Map<String, String> testMap;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getTestMap() {
        return testMap;
    }

    public Immutable(int id, String name, Map<String, String> map) {
        System.out.println("Performing Deep Copy for Object initialization");
        this.id = id;
        this.name = name;
        Map<String, String> tempMap = new HashMap<String, String>();
        String key;

        for (String s : map.keySet()) {
            key = s;
            tempMap.put(key, map.get(key));
        }
        this.testMap = tempMap;
    }
}
