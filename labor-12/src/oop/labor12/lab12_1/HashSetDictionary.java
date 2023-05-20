package oop.labor12.lab12_1;

import java.util.HashMap;
import java.util.Map;

public class HashSetDictionary implements IDictionary {

    private Map<Object, Object> map;

    private HashSetDictionary() {
        map = new HashMap<>();
    }

    static HashSetDictionary newInstance() {
        return new HashSetDictionary();
    }


    @Override
    public boolean add(String word) {
        return false;
    }

    @Override
    public boolean find(String word) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
