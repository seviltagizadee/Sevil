package PDF9EVISI1;

public class Exception4 {
    public static void main(String[] args)  {
     checkNegative(-9);
    }
    public static void checkNegative(int a) {
        if (a<0){
            throw new IllegalArgumentException();
        }
    }
}
