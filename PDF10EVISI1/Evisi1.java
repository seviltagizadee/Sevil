package PDF10EVISI1;

import static java.lang.Integer.parseInt;

public class Evisi1 {
    public static void main(String[] args) {
     //1
        String binary1 = "1010";
        int decimal1 = Integer.parseInt(binary1,2);
        System.out.println(decimal1);

        //2
        int deciaml2 = 10;
        String binary2 = Integer.toBinaryString(deciaml2);
        System.out.println(binary2);

        //3
        String hexadecimal1 = "1A";
        int decimal3 = Integer.parseInt(hexadecimal1,16);
        System.out.println(hexadecimal1);

        //4
        int decimal4 = 8;
        String octal1 = Integer.toOctalString(decimal4);
        System.out.println(octal1);

        //5
        String octal2 = "10";
        int decimal5 = Integer.parseInt(octal2,8);
        System.out.println(decimal5);
    }
}
