package oop.labor09.lab9_2;

public enum DictionaryType {
    ARRAY_LIST, TREE_SET, HASH_SET;
    //EZEK BENNE VANNAK AZ ENUMBAN

    public static DictionaryType[] Values() {
        return DictionaryType.values();
    }

//    public static DictionaryType valueOf(String word) {
//        //return DictionaryType.valueOf(word);
//        return ;
//    }
}
