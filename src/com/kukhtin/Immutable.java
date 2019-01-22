package com.kukhtin;

import java.util.HashMap;
import java.util.Iterator;

public final class Immutable {
    private final int id;
    private final String name;
    private final HashMap<String, String> testMap;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestMap() {
        return testMap;
    }

    public Immutable(int i, String n, HashMap<String, String> hm) {
        System.out.println("Performing Deep Copy for Object initialization");
        this.id = i;
        this.name = n;
        HashMap<String, String> tempMap = new HashMap<String, String>();
        String key;
        Iterator<String> it = hm.keySet().iterator();
        while (it.hasNext()) {
            key = it.next();
            tempMap.put(key, hm.get(key));
        }
        this.testMap = tempMap;
    }
}
