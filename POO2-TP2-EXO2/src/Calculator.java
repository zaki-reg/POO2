
public class Calculator {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static double inverse(int a) {
        return 1.0 / a;
    }

    public static double rootSquare(double a) {
        return Math.sqrt(a);
    }

    public static double power(int a, int b) {
        return Math.pow(a, b);
    }

    public static int convertToInt(String s) {
        return Integer.parseInt(s);
    }

    public static double convertToDble(String s) {
        return Double.parseDouble(s);
    }
}

