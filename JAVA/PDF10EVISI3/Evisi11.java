package PDF10EVISI3;

public class Evisi11 {

    public static void main(String[] args) {
        convert("1111");
    }
    public static void convert(String num) {
       int decimal1 = Integer.parseInt(num,2);
       String binary = Integer.toBinaryString(decimal1);
       String octal = Integer.toOctalString(decimal1);
       String hexadecimal = Integer.toHexString(decimal1);
        System.out.println(decimal1);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hexadecimal);
    }

}

