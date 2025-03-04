package exercises.chapter3.Date.test;

import exercises.chapter3.Date.domain.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();

        date.setMonth(2);
        date.setDay(29);
        date.setYear(2004);

        date.displayDate();
    }
}
