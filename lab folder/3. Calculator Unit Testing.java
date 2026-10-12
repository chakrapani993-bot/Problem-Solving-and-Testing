
public class CalculatorUnitTesting {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }

    static void test(String name, double actual, double expected) {
        if (Math.abs(actual - expected) < 0.000001) {
            System.out.println(name + ": PASS");
        } else {
            System.out.println(name + ": FAIL");
        }
    }

    public static void main(String[] args) {
        test("Addition", add(10, 5), 15);
        test("Subtraction", subtract(10, 5), 5);
        test("Multiplication", multiply(10, 5), 50);
        test("Division", divide(10, 5), 2);

        try {
            divide(10, 0);
            System.out.println("Division by Zero: FAIL");
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero: PASS");
        }
    }
}


Addition: PASS
Subtraction: PASS
Multiplication: PASS
Division: PASS
Division by Zero: PASS
