package BasicsLearnI;

import java.util.Scanner;

public class CreditPureCash {
    public static void main(String[] args) {


        final double pricePerKilometer = 8.5;
        int odoBefore;
        int odoAfter;
        int kilometerValue;
        double priceOfTrip;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите показания одометра до поездки: ");
        odoBefore = scanner.nextInt();

        System.out.println("Теперь введите показания одометра по завершению поездки: ");
        odoAfter = scanner.nextInt();
        scanner.close();

        kilometerValue = odoAfter - odoBefore;
        priceOfTrip = kilometerValue * pricePerKilometer;

        System.out.println("Вы проехали " + kilometerValue + " км. Из расчета " + pricePerKilometer + " руб за км." );
        System.out.println("Cтоимость проезда равна " + priceOfTrip + " руб.");
    }
}
