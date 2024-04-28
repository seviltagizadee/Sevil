//Ders Praktikasi-1(PDF 2)
public class PrimitiveTypeConversion {
    public static void main(String[] args) {
     // 1.
        short a = 69;
        byte b = (byte)a;
        System.out.println(b);

     // 2.
        short c = 589 ;
        byte d = (byte)c;
        System.out.println(d);

     // 3.
        long e = 458;
        int f = (int)e;
        System.out.println(f);

    // 4.
        long q = 52523635483L;
        int  k = (int)q;
        System.out.println(k);

    // 5.
        double l = 5632.6;
        float m = (float)l;
        System.out.println(m);

    // 6.
        char n = 'D';
        int r = n;
        System.out.println(r);

    // 7.
        int x = 123;
        char y = (char)x;
        System.out.println(y);
    }
}
