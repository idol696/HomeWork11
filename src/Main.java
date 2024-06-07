import java.time.LocalDate;

public class Main {

    public static void leapYear(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void softDownloadMessage(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int getDeliveryDay(int deliveryDistance) {
        int deliveryDay = -1;
        if (deliveryDistance <= 100) {
            if (deliveryDistance < 20) {
                deliveryDay = 1;
            } else if (deliveryDistance < 60) {
                deliveryDay = 2;
            } else  {
                deliveryDay = 3;
            }
        }
        return deliveryDay;
    }


    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 2000;
        leapYear(year);

        System.out.println("Задача 2");
        softDownloadMessage(0, 2015);

        System.out.println("Задача 3");
        int distance = 65;
        int deliveryDay = getDeliveryDay(distance);
        if (deliveryDay >= 0) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
}
