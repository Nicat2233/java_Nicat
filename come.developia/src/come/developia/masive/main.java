package come.developia.masive;
import java.util.Scanner;
public class main {


    public class Info {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Имя: ");
            String name = sc.nextLine();

            System.out.print("Фамилия: ");
            String surname = sc.nextLine();

            System.out.print("Возраст: ");
            int age = sc.nextInt();
            sc.nextLine(); // очистка

            System.out.print("Школа: ");
            String school = sc.nextLine();

            System.out.print("Адрес: ");
            String address = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Телефон: ");
            String phone = sc.nextLine();

            System.out.println(); // пустая строка
            System.out.println("Твои данные:");
            System.out.println(name + " " + surname + ", " + age + " лет");
            System.out.println("Школа: " + school);
            System.out.println("Адрес: " + address);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phone);
        }
    }

}
