package oop.labor02;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int pYear, int pMonth, int pDay) {
        if (DateUtil.isValidDate(pYear, pMonth, pDay)) {
            year = pYear;
            month = pMonth;
            day = pDay;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    //mindent
    public String toStringDate() {
        System.out.printf("\nYear: %d\nMonth: %d\nDay: %d\n", getYear(), getMonth(), getDay());
        return "";
    }

}
