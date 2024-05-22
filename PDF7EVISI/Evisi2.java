package PDF7EVISI;

public class Evisi2 {
    public static void main(String[] args) {
        //1
        char[] simvol = {'a','l','m','a'};
        String simvol1 = String.copyValueOf(simvol);
        System.out.println(simvol1);

        //2
        String meyve = "Armud";
        int simvolsayi = meyve.length();

        if (simvolsayi>3){
            System.out.println("Simvol sayi 3-den coxdur");
        }else{
            System.out.println("Simvol sayi 3-den azdir");
        }

        //3
        String name = "Ayxan";
        boolean sert = name.isBlank();

        if (sert==true){
            System.out.println("Setir bosdur");
        }else{
            System.out.println("Setir bos deyil");
        }


        //4
       boolean netice = Yoxlama("Sevil Tagizade","Tagizade");
        System.out.println(netice);
    }


        //4
        static boolean Yoxlama(String soz1, String soz2){
           boolean yoxla = soz1.endsWith(soz2);
           return yoxla;
        }


}
