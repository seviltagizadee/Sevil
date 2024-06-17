package PDF10EVISI3;

import java.util.Scanner;

public class Evisi15 {
    public static void main(String[] args) {
    operation("10","20");
    }

    public static void operation(String number1,String number2){
        int num1 =Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int result1,result2,result3,result4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type of number system \n" +
                "1.Binary\n" +
                "2.Decimal\n" +
                "3.Octal\n" +
                "4.Hexadecimal");
        int choose = scanner.nextInt();

        if(choose == 1){
            result1 = num1 + num2;
            result2 = num1 - num2;
            result3 = num1 * num2;
            result4 = num1 / num2;
            String result11 = Integer.toBinaryString(result1);
            String result12 = Integer.toBinaryString(result2);
            String result13 = Integer.toBinaryString(result3);
            String result14 = Integer.toBinaryString(result4);
            System.out.println("ADD:" + result11);
            System.out.println("SUBTRACTION:" +result12);
            System.out.println("MULTIPLY:" +result13);
            System.out.println("DIVIDED:" +result14);

        }

        if(choose == 2){
            result1 = num1 + num2;
            result2 = num1 - num2;
            result3 = num1 * num2;
            result4 = num1 / num2;
            int result11 = Integer.parseInt(String.valueOf(result1));
            int result12 = Integer.parseInt(String.valueOf(result2));
            int result13 = Integer.parseInt(String.valueOf(result3));
            int result14 = Integer.parseInt(String.valueOf(result4));
            System.out.println("ADD:" + result11);
            System.out.println("SUBTRACTION:" +result12);
            System.out.println("MULTIPLY:" +result13);
            System.out.println("DIVIDED:" +result14);

        }

        if(choose == 3){
            result1 = num1 + num2;
            result2 = num1 - num2;
            result3 = num1 * num2;
            result4 = num1 / num2;
            String result11 = Integer.toOctalString(result1);
            String result12 = Integer.toOctalString(result2);
            String result13 = Integer.toOctalString(result3);
            String result14 = Integer.toOctalString(result4);
            System.out.println("ADD:" + result11);
            System.out.println("SUBTRACTION:" +result12);
            System.out.println("MULTIPLY:" +result13);
            System.out.println("DIVIDED:" +result14);

        }
        if(choose == 4){
            result1 = num1 + num2;
            result2 = num1 - num2;
            result3 = num1 * num2;
            result4 = num1 / num2;
            String result11 = Integer.toHexString(result1);
            String result12 = Integer.toHexString(result2);
            String result13 = Integer.toHexString(result3);
            String result14 = Integer.toHexString(result4);
            System.out.println("ADD:" + result11);
            System.out.println("SUBTRACTION:" +result12);
            System.out.println("MULTIPLY:" +result13);
            System.out.println("DIVIDED:" +result14);

        }
    }
    }

