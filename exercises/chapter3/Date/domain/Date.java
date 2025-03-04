package exercises.chapter3.Date.domain;

public class Date {
    public int month;
    public int day;
    public int year;

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void displayDate(){
        System.out.printf("%d/%d/%d", month, day, year);
    }
}
