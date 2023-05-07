package oop.labor09.lab9_gyakorlas_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryService {

    private IDictionary dictionary;

    public DictionaryService(DictionaryType type) {
        this.dictionary = DictionaryProvider.createDictionary(type);
    }

    public boolean findWord(String word) {
        return dictionary.find(word);
    }

    public ArrayList<String> findWordsFile(String fileName) {
        ArrayList<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items;
                line = line.replaceAll(",", "");
                line = line.replaceAll("\\.", "");
                line = line.replaceAll("\\?", "");
                line = line.replaceAll("!", "");
                line = line.replaceAll(":", "");
                line = line.replaceAll(";", "");
                items = line.split(" ");
                for (String item : items) {
                    if (dictionary.find(item)) {
                        words.add(item);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }
}
