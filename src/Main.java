import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2022);
        checkDeviceOs(0, LocalDate.now().getYear());
        int deliveryDays = calculationOfDeliveryDays(40);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkDeviceOs(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        clientDeviceYear = currentYear;
        if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int calculationOfDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }
}
