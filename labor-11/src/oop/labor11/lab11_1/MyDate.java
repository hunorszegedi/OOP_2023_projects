package oop.labor11.lab11_1;

public class MyDate implements Comparable<MyDate> {
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
//    public String toStringDate() {
//        System.out.printf("\nYear: %d\nMonth: %d\nDay: %d\n", getYear(), getMonth(), getDay());
//        return "";
//    }


    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        if (this.year == o.year) {
            if (this.month == o.month) {
                return this.day - o.day;
            }
            return this.month - o.month;
        }
        return this.year - o.year;
    }
}
