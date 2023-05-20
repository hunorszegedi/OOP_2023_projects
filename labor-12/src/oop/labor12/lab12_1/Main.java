package oop.labor12.lab12_1;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        DictionaryService service = new
                DictionaryService(DictionaryType.ARRAY_LIST);
        service.findWordsFile("bible.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed / 1000000);
    }
}
