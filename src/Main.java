public class Main {
    //Метод проверки високосного года
    public static void isLeapYear(int year) {
        if ( ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) && (year > 1584) ) {
            System.out.println ( year + " - високосный год" );
        } else {
            System.out.println ( year + " - невисокоссный год" );
        }
    }

    //Метод проверки устройства пользователя
    public static void checkUserDevice(int OS, int yearOfProduction) {
        if ( yearOfProduction >= 2015 ) {
            if ( OS == 0 ) {
                System.out.println ( "Установите версию приложения для iOS по ссылке" );
            } else {
                System.out.println ( "Установите версию приложения для Android по ссылке" );
            }
        } else {
            if ( OS == 0 ) {
                System.out.println ( "Установите облегчённую версию приложения для iOS по ссылке" );
            } else {
                System.out.println ( "Установите облегчённую версию приложения для Android по ссылке" );
            }
        }
    }

    //Метод расчёта доставки банковской карты
    public static int calculateDeliveryDays(int deliveryDistance) {
        int deleveryDays = 1;
        if ( deliveryDistance < 20 ) {
            return 1;
        }
        if ( deliveryDistance > 20 ) {
            deleveryDays++;
        }
        if ( deliveryDistance > 60 ) {
            deleveryDays++;
        }
        if ( deliveryDistance > 100 ) {
            return 0;
        }
        return (deleveryDays);
    }

    public static void main(String[] args) {
        isLeapYear ( 2024 );
        checkUserDevice ( 1, 2015 );
        int deliveryDistance = 95;
        if ( calculateDeliveryDays ( deliveryDistance ) == 0 ) {
            System.out.println ( "Доставки нет" );
        } else {
            System.out.println ( "Количество дней доставки - " + calculateDeliveryDays ( deliveryDistance ) );
        }
    }
}