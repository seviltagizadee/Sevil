public class PrimitiveTypeConversionHome {
    public static void main(String[] args) {
        // 1.
        int a = 55;
        byte b = (byte)a;
        System.out.println(b);

        // 2.
        short c = 636 ;
        byte d = (byte)c;
        System.out.println(d);

        // 3.
        long e = 458;
        short f = (short) e;
        System.out.println(f);

        // 4.
        long q = 92523635483L;
        int  k = (int)q;
        System.out.println(k);

        // 5.
        double l = 65787.3 ;
        int m = (int)l;
        System.out.println(m);

        // 6.
        char n = 'q';
        int r = n;
        System.out.println(r);

        // 7.
        int x = 266;
        char y = (char)x;
        System.out.println(y);
    }
}
