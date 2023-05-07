package oop.labor09.lab9_gyakorlas_2;


public class DictionaryProvider implements IDictionary {
    public static IDictionary createDictionary(DictionaryType dtype) {
        IDictionary dictionary = null;
        switch (dtype) {
            case ARRAY_LIST:
                dictionary = ArrayListDictionary.newInstance();
                break;
            case HASH_SET:
                dictionary = HashSetDictionary.newInstance();
                break;
            case TREE_SET:
                dictionary = TreeSetDictionary.newInstance();
                break;
        }
        return dictionary;
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
