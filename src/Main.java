import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int onPhone = (100);

        int amountAdded = 1200;

        int bonus = amountAdded / 100;
        int overall2 = onPhone + amountAdded;
         if (amountAdded < 1000)
         { System.out.println("Сумма на телефоне:" + " " + overall2 + " " + "Бонусов нет");}
        else if (amountAdded > 1000){
            int overall = onPhone + amountAdded + bonus;
            System.out.println("Итоговые бонусы:" + bonus);
            System.out.println("Сумма на телефоне:" + overall);
        }

    }
}
