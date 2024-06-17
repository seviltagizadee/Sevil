package PDF10EVISI2;

public class Evisi2 {
    public static void main(String[] args) {
        //6
       String binary1 = "1010";
       int decimal1 = Integer.parseInt(binary1,2);
       String hexadecimal1 = Integer.toHexString(decimal1);
        System.out.println(hexadecimal1);

        //7
        String hexadecimal2 = "11A";
        int decimal2 = Integer.parseInt(hexadecimal2,16);
        String binary2 = Integer.toBinaryString(decimal2);
        System.out.println(binary2);

        //8
        int decimal3 = 555;
        String hexadecimal3 = Integer.toHexString(decimal3);
        System.out.println(hexadecimal3);

        //9
         subtarction1("1100","1010");
         addition1("1100","1010");

         //10
        subtarction2("123","555");
        addition2("123","555");
    }
    public static void subtarction1(String binary3,String binary4){
        int num1 = Integer.parseInt(binary3);
        int num2 = Integer.parseInt(binary4);
        int result = num1-num2;
        String subtraction = Integer.toBinaryString(result);
        System.out.println(subtraction);

    }
    public static void addition1(String binary3,String binary4){
        int num1 = Integer.parseInt(binary3);
        int num2 = Integer.parseInt(binary4);
        int result = num1+num2;
        String subtraction = Integer.toBinaryString(result);
        System.out.println(subtraction);

    }

    public static void subtarction2(String octal1,String octal2){
        int num1 = Integer.parseInt(octal1);
        int num2 = Integer.parseInt(octal2);
        int result = num1-num2;
        String subtraction = Integer.toOctalString(result);
        System.out.println(subtraction);

    }
    public static void addition2(String octal1,String octal2){
        int num1 = Integer.parseInt(octal1);
        int num2 = Integer.parseInt(octal2);
        int result = num1+num2;
        String subtraction = Integer.toOctalString(result);
        System.out.println(subtraction);

    }

}
