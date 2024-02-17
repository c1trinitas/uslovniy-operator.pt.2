public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Test 1");
        int age = 6;
        if (age == 18) {
            System.out.println("Поздравляю с окончанием школы!");
        } else if (age == 21) {
            System.out.println("Теперь ты можешь пить алкоголь");
        } else if (age == 7) {
            System.out.println("Тебе надо идти в школу");
        } else {
            System.out.println("Мне нечего сказать");
        }
        System.out.println("Test 2");
        char color = 'g';
        switch (color) {
            case 'r' :
                System.out.println("Красный цвет. Проезд запрещён!");
                break;
            case 'y' :
                System.out.println("Желтый. Внимание!");
                break;
            case 'g' :
                System.out.println("Зелёный. Проезд разрешён");
            case 'l' :
                System.out.println("Поверните налево");
                break;
            default:
                System.out.println("Светофор сломан");
        }
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Task 2");
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        System.out.println("Task 3");
        int year = 2021;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
        System.out.println("Task 4");
        int  deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20 && deliveryDistance > 60) {
            System.out.println("Длительность доставки увеличется на" + days + "дней");
        } if (deliveryDistance > 100) {
            days = -1;
        } if (days == -1) {
            System.out.println("Доставки нет");
        }
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber ) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "месяц-это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "месяц-это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "месяц-это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "месяц-это осень");
                break;
        } if (monthNumber > 12) {
            System.out.println("такого месяца нет");
        }

    }
}
