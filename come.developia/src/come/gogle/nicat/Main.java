package come.gogle.nicat;

public class Main {
    public static void main(String[] args) {
        MathUnits mathUnits = new MathUnits();

        int my_number = mathUnits.add(5, 10, 15);
        int my_number2 = mathUnits.add(2, 100, 30);
        int sum_myNums = my_number + my_number2;
        mathUnits.multpl(10, 5, -4);

        int resultMinus = mathUnits.minus(50, 20, 5);
        double resultDivide = mathUnits.divide(100, 2);

        System.out.println(my_number);
        System.out.println(my_number2);
        System.out.println(sum_myNums);
        System.out.println(resultMinus);
        System.out.println(resultDivide);
        
    }
}

class MathUnits {
    int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    void multpl(int x, int y, int z) {
        int product = x * y * z;
        System.out.println(product);
    }

    int minus(int a, int b, int c) {
        int result = a - b - c;
        return result;
    }

    double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("На ноль делить нельзя!");
            return 0;
        }
    }
}
