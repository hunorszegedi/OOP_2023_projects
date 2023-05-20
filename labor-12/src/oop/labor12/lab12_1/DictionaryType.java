package oop.labor12.lab12_1;

public enum DictionaryType {
    ARRAY_LIST, TREE_SET, HASH_SET;

    public static DictionaryType valueOfThis(String word) throws IllegalArgumentException {
        for (DictionaryType type : values()) {
            if (type.name().equalsIgnoreCase(word)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant " + DictionaryType.class.getName() + "." + word);
    }

}

