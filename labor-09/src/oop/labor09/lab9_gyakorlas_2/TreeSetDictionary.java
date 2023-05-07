package oop.labor09.lab9_gyakorlas_2;

import java.util.Map;
import java.util.TreeMap;

public class TreeSetDictionary implements IDictionary {

    private Map<Object, Object> map;

    private TreeSetDictionary() {
        map = new TreeMap<>();
    }

    static TreeSetDictionary newInstance() {
        return new TreeSetDictionary();
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
