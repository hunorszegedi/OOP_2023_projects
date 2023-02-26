package oop.labor02;

public class DateUtil {
    public boolean leapYear;
    public boolean isValidDate;


    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isValidDate(int year, int month, int day) {
        //Az évnek pozitívnak kell lennie, a hónapnak 1 és 12 között kell lennie és a napnak legalább 1-nek kell lennie.
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        // Hónap max napjainak számának meghatározása
        int maxDaysInMonth = 31;
        switch (month) {
            case 2:
                // Ha február a hónap, akkor ellenőriznünk kell, hogy a megadott év szökőév-e,
                // mivel ez befolyásolja a hónap maximális napjainak számát.
                if (leapYear(year)) {
                    maxDaysInMonth = 29;
                } else {
                    maxDaysInMonth = 28;
                }
                break;
            case 4: //aprilis
            case 6: //junius
            case 9: //szeptember
            case 11: //november
                // Április, június, szeptember és november 30 naposak
                maxDaysInMonth = 30;
                break;
            default:
                // A maradék hónapok 31 naposak.
                maxDaysInMonth = 31;
                break;
        }

        // Ellenőrizzük, hogy a megadott nap érvényes-e a megadott hónapban.
        if (day > maxDaysInMonth) {
            return false;
        }

        // Ha mindhárom feltétel teljesül, akkor a megadott év, hónap és nap
        // érvényes dátumot alkotnak.
        return true;
    }


}
