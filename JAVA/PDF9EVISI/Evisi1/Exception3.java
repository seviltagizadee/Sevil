package PDF9EVISI1;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        String number1 = scanner.nextLine();
        System.out.println("Enter second number:");
        String number2 = scanner.nextLine();

        try {
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            int result=num1/num2;
            System.out.println(result);
        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }catch (NumberFormatException exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("FINALLY");
        }

    }
}
