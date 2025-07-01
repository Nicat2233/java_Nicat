package nifes_food;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void accountType() {
        System.out.println("Тип счета");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        System.out.println("Снятие со сберегательного счета");
        super.withdraw(amount);
    }

    @Override
    void accountType() {
        System.out.println("Сберегательный счет");
    }
}

class CheckingAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        System.out.println("Снятие с расчетного счета");
        super.withdraw(amount);
    }

    @Override
    void accountType() {
        System.out.println("Расчетный счет");
    }
}

class BusinessAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        System.out.println("Снятие с бизнес-счета");
        super.withdraw(amount);
    }

    @Override
    void accountType() {
        System.out.println("Бизнес счет");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount(),
                new CheckingAccount(),
                new BusinessAccount()
        };

        for (BankAccount acc : accounts) {
            acc.accountType();
            acc.deposit(1000);
            acc.withdraw(500);
            System.out.println();
        }
    }
}
