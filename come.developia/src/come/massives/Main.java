package come.massives;
 import java.util.Random; // Подключаем класс для рандома чисел

 public class Main {
     public static void main(String[] args) {
         int[] numbers = new int[10]; // Создаём массив из 10 чисел
         Random random = new Random(); // Объект для генерации случайных чисел

         // Заполняем массив случайными числами от 10 до 200
         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = random.nextInt(191) + 10; // 191, потому что 200 - 10 + 1 = 191
         }

         // Показываем массив на экране
         System.out.println("Наш массив:");
         for (int i = 0; i < numbers.length; i++) {
             System.out.print(numbers[i] + " ");
         }

         System.out.println("\n\nИндексы чисел больше 100:");
         // Ищем и выводим индексы элементов больше 100
         for (int i = 0; i < numbers.length; i++) {
             if (numbers[i] > 100) {
                 System.out.println("Индекс " + i + " (значение: " + numbers[i] + ")");
             }
         }
     }
 }

