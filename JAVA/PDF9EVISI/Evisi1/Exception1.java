package PDF9EVISI1;

public class Exception1 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 0;
        try {
            int result = number1/number2;
            System.out.println(result);
        }catch (ArithmeticException exception){
            System.out.println("You Dont divided by zero");
        }
    }
}
