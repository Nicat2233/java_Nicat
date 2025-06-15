package come.home;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {



                Scanner sc = new Scanner(System.in);

                // спрашиваем у пользователя данные
                System.out.print("Имя: ");
                String name = sc.nextLine();

                System.out.print("Фамилия: ");
                String surname = sc.nextLine();

                System.out.print("Возраст: ");
                int age = sc.nextInt();
                sc.nextLine(); // чтобы не глючил следующий ввод

                System.out.print("Школа: ");
                String school = sc.nextLine();

                System.out.print("Адрес: ");
                String address = sc.nextLine();

                System.out.print("Email: ");
                String email = sc.nextLine();

                System.out.print("Телефон: ");
                String phone = sc.nextLine();

                // выводим всё
                System.out.println("Привет, " + name + " " + surname + "!");
                System.out.println("Тебе " + age + " лет.");
                System.out.println("Ты учишься в школе: " + school);
                System.out.println("Твой адрес: " + address);
                System.out.println("Твой email: " + email);
                System.out.println("Твой телефон: " + phone);
            }
        }


