package oop.labor12.lab12_3;

public class Main_lab12_3 {
    public static void main(String[] args) {
        String subjects[] = {"magyar", "matek", "roman"};
        Bac bac = new Bac();
        bac.readNames("nevek1.txt");

        for (String subject : subjects) {
            bac.readSubjects(subject);
            System.out.println();
        }

        bac.calculataAverages();
        System.out.println("Passed: " + bac.numPassed());

        System.out.println("Failed:\n");
        bac.printFailed();
    }
}
