package oop.labor12.lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words;
    private static ArrayListDictionary instance;

    private ArrayListDictionary() {
        words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                words.add(word);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(words);
    }

    public static IDictionary newInstance() {
        if (instance == null) {
            instance = new ArrayListDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {
        return this.words.add(word);
    }

    @Override
    public boolean find(String word) {
        int position = Collections.binarySearch(words, word); //miben mit keres
        return position >= 0;
    }


    @Override
    public int size() {
        return this.words.size();
    }
}