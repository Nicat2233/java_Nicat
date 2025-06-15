package come.month;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "Алиса";
        double height = 1.55;
        char favChar = 'K';

        System.out.print("Введите возраст: ");
        int age = scan.nextInt();

        System.out.print("Есть скидочная карта? (да/нет): ");
        String cardInput = scan.next();
        boolean hasCard = cardInput.equalsIgnoreCase("да");

        System.out.print("Сколько покупок? (1-3): ");
        int purchases = scan.nextInt();

        // Проверка, чтобы покупки были от 1 до 3
        if (purchases < 1 || purchases > 3) {
            System.out.println("Неверное количество покупок.");
        } else {
            System.out.println("\n📝 Данные:");
            System.out.println("Имя: " + name);
            System.out.println("Возраст: " + age);
            System.out.println("Рост: " + height + " м");
            System.out.println("Скидочная карта: " + hasCard);
            System.out.println("Любимая буква: " + favChar);
            System.out.println("Покупок: " + purchases);
}
}
}
