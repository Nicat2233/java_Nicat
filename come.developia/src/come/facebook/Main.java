package come.facebook;
import java.util.Scanner;
public class Main{
        public static void main(String[] args) {
            // Задание 1: Массив и сумма
            int[] numbers = new int[5];
            numbers[0] = 5;
            numbers[1] = 10;
            numbers[2] = 7;
            numbers[3] = 8;
            numbers[4] = 12;

            int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
            System.out.println("Сумма всех элементов массива: " + sum);

            // Задание 2: Scanner - имя и возраст
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();
            System.out.println("Привет, " + name + "! Тебе " + age + " лет.");

            // Задание 3: Типы данных
            int myAge = 25;
            long population = 7800000000L;
            double price = 19.99;
            boolean isStudent = true;
            char grade = 'A';

            System.out.println("Возраст: " + myAge);
            System.out.println("Население: " + population);
            System.out.println("Цена: " + price);
            System.out.println("Студент? " + isStudent);
            System.out.println("Оценка: " + grade);

            // Задание 4: if-else возраст
            System.out.print("Введите свой возраст: ");
            int userAge = scanner.nextInt();
            if (userAge < 18) {
                System.out.println("Ты ещё несовершеннолетний.");
            } else if (userAge < 60) {
                System.out.println("Ты взрослый.");
            } else {
                System.out.println("Ты пенсионер.");
            }

            // Задание 5: switch день недели
            System.out.print("Введите число (1-5): ");
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Сегодня: Понедельник");
                    break;
                case 2:
                    System.out.println("Сегодня: Вторник");
                    break;
                case 3:
                    System.out.println("Сегодня: Среда");
                    break;
                case 4:
                    System.out.println("Сегодня: Четверг");
                    break;
                case 5:
                    System.out.println("Сегодня: Пятница");
                    break;
                default:
                    System.out.println("Неправильный номер.");
            }

            // 🌟 Бонус: Калькулятор оценки экзамена
            scanner.nextLine(); // очистка буфера
            System.out.print("Введите имя: ");
            String studentName = scanner.nextLine();

            System.out.print("Введите оценку 1: ");
            int score1 = scanner.nextInt();
            System.out.print("Введите оценку 2: ");
            int score2 = scanner.nextInt();
            System.out.print("Введите оценку 3: ");
            int score3 = scanner.nextInt();

            int[] scores = {score1, score2, score3};
            double average = (scores[0] + scores[1] + scores[2]) / 3.0;

            String letterGrade;
            if (average >= 90) {
                letterGrade = "A";
            } else if (average >= 75) {
                letterGrade = "B";
            } else if (average >= 60) {
                letterGrade = "C";
            } else {
                letterGrade = "F";
            }

            String comment;
            switch (letterGrade) {
                case "A":
                    comment = "Отлично!";
                    break;
                case "B":
                    comment = "Хорошо!";
                    break;
                case "C":
                    comment = "Удовлетворительно.";
                    break;
                default:
                    comment = "Нужно постараться.";
            }

            System.out.println("Привет, " + studentName + "! Твоя средняя оценка: " + average);
            System.out.println("Оценка: " + letterGrade);
            System.out.println("Комментарий: " + comment);
          
        }
    }


