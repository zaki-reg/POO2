import java.util.InputMismatchException;
import java.util.Scanner;

public class ExoExceptions {
	
    public static void main(String[] args) {
        String nb = "4";

        try {
            System.out.println("Root Square of nb = " +
                Calculator.rootSquare(Calculator.convertToDble(nb)));

            System.out.print("Enter an Integer Number: ");
            try (Scanner s = new Scanner(System.in)) {
				int n = s.nextInt();

				double d = Calculator.divide(Integer.parseInt(nb), n);
				System.out.println("nb / n = " + d);
				System.out.println("Root Square of 1/(nb/n) = " +
				    Calculator.rootSquare(1 / d));

				int[] t = new int[Calculator.divide(n, Calculator.convertToInt(nb))];
				for (int i = 0; i < t.length; i++) {
				    t[i] = (int) Calculator.power(n, i);
				}

				System.out.println("t[3] = " + t[3]);
			}

        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type: please enter an integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
