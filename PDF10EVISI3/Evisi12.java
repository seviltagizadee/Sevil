package PDF10EVISI3;

public class Evisi12 {
    public static void convert(float num){
        int decimal = Math.round(num);
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
    }

    public static void main(String[] args) {
        convert(12.755F);
    }
}

