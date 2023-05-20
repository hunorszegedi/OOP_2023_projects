package oop.labor12.lab12_1;

public interface IDictionary {
    final String DICTIONARY_FILE = "bible.txt";

    boolean add(String word);

    boolean find(String word);

    int size();
}
