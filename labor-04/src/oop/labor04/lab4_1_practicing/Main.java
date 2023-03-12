package oop.labor04.lab4_1_practicing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Music> music = readFromTxtFile("rockBands.txt");
        System.out.println(music);

    }

    public static ArrayList<Music> readFromTxtFile(String fileName) {
        ArrayList<Music> musics = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");

                String bandName = items[0].trim();
                String origin = items[1].trim();
                String genres = items[2].trim();
                int yearOfFoundation = Integer.parseInt(items[3].trim());

                String[] albums = items[4].split(";");
                double rating = Double.parseDouble(items[5].trim());

                Music music = new Music(bandName, origin, genres, yearOfFoundation, albums, rating);
                musics.add(music);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Error message!\n");
        }
        return musics;
    }

}
