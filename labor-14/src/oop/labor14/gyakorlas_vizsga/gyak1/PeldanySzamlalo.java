package oop.labor14.gyakorlas_vizsga.gyak1;

public class PeldanySzamlalo {
    private int szam;
    private static int peldanySzam = 0;

    public PeldanySzamlalo() {
        peldanySzam++;
        szam = peldanySzam;
    }

    public static int getPeldanySzam() {
        return peldanySzam;
    }

    @Override
    public String toString() {
        return "PeldanySzamlalo{" +
                "szam=" + szam +
                '}';
    }
}
