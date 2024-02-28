import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int onphone = (100);

        int amountadded =1400;

        int bonus = amountadded / 100;
int bonusless1000 =0;
        int overall2 = onphone + amountadded;
            if (amountadded < 1000)  System.out.println("Сумма на телефоне:"+ " "  + overall2 + " " + "Бонусов нет");
            else if (amountadded> 1000) {
                int overall = onphone + amountadded + bonus;
                System.out.println("Итоговые бонусы:" + bonus );
                System.out.println("Сумма на телефоне:" + overall );
            }







    // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
