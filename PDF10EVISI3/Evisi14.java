package PDF10EVISI3;

public class Evisi14 {
    public static void convert(int num){
        long largenumber = num;
        String binary = Integer.toBinaryString((int)largenumber);
        System.out.println(binary);
    }

    public static void main(String[] args) {
        convert(10_000_000);
    }
}

