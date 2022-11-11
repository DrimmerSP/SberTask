import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*final int MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60,
                MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24, MOSCOW_MEAN_TIME = 3;

        long totalMilliseconds, totalSeconds, currentSecond,
                totalMinutes, currentMinute, totalHours, currentHour, currentTime;

        // Получить общее кол-во миллисекунд, прошедших с 00:00:00 GMT 01/01/1970
        totalMilliseconds = System.currentTimeMillis();

        // Вычислить общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;

        // Вычислить текущее кол-во секунд
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;

        // Вычислить общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;

        // Вычислить текущее кол-во минут
        currentMinute = totalMinutes % MINUTES_PER_HOUR;

        // Вычислить общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970
        totalHours = totalMinutes / MINUTES_PER_HOUR;

        // Вычислить текущее кол-во часов по Гринвичу
        currentHour = totalHours % HOURS_PER_DAY;

        //Делаем поправку временную зону
        currentTime = currentHour + MOSCOW_MEAN_TIME;

        // Отобразить текущее время по Гринвичу
        System.out.println("Текущее время равно " + currentTime + ":"
                + currentMinute + ":" + currentSecond + " +3 GMT.");*/

        int amount, numberOf5000Roubles, numberOf2000Roubles,
                numberOf1000Roubles, numberOf500Roubles, numberOf100Roubles,
                numberOf200Roubles, numberOf50Roubles;

        amount = 150;
        // Вычислить количество 5 тыс. руб. купюр и обновить оставшуюся сумму
        numberOf5000Roubles = amount / 5000;
        amount %= 5000;

        // Вычислить количество 2 тыс. руб. купюр и обновить оставшуюся сумму
        numberOf2000Roubles = amount / 2000;
        amount %= 2000;

        // Вычислить количество 1 тыс. руб. купюр и обновить оставшуюся сумму
        numberOf1000Roubles = amount / 1000;
        amount %= 1000;

        // Вычислить количество 500 руб. купюр и обновить оставшуюся сумму
        numberOf500Roubles = amount / 500;
        amount %= 500;

        // Вычислить количество 200 руб. купюр и обновить оставшуюся сумму
        numberOf200Roubles = amount / 200;
        amount %= 200;

        // Вычислить количество 100 руб. купюр и обновить оставшуюся сумму
        numberOf100Roubles = amount / 100;
        amount %= 100;

        // Вычислить количество 50 руб. купюр
        numberOf50Roubles = amount / 50;

        // Отобразить количество купюр каждого достоинства
        System.out.println("Ваша сумма состоит из");
        System.out.println("    " + numberOf5000Roubles + " шт. 5-тыс. руб. купюр,");
        System.out.println("    " + numberOf2000Roubles + " шт. 2-тыс. руб. купюр,");
        System.out.println("    " + numberOf1000Roubles + " шт. 1-тыс. руб. купюр,");
        System.out.println("    " + numberOf500Roubles + " шт. 500-руб. купюр,");
        System.out.println("    " + numberOf200Roubles + " шт. 200-руб. купюр,");
        System.out.println("    " + numberOf100Roubles + " шт. 100-руб. купюр,");
        System.out.println("    " + numberOf50Roubles + " шт. 50-руб. купюр.");
    }
}