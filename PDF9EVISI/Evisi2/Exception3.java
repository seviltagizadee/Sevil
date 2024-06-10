package PDF9EVISI2;

public class Exception3 {
    public static void main(String[] args) {
        int num1 = 5;
        int[] arr = new int[3];
        String str = "";

        try {
            System.out.println(num1/0);
            System.out.println(arr[5]);
            System.out.println(str);
        }catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
        }
    }

