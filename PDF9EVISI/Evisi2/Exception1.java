package PDF9EVISI2;

public class Exception1 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            try {
                System.out.println(arr[5]/0);
            }catch (ArithmeticException exception){
                System.out.println(exception.getMessage());
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
                System.out.println(exception.getMessage());
            }
        }
    }

