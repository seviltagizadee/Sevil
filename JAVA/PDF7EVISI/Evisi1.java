package PDF7EVISI;

public class Evisi1 {
    public static void main(String[] args) {
        //1
        String name = "Məhərrəm";
        System.out.println(name);

        //2
        String message = "Java dilini öyrənmək maraqlı və faydalıdır";
        System.out.println(message);

        //3
        int simvolsayi = message.length();
        System.out.println(simvolsayi);

        //4
        char simvol4 = message.charAt(7);
        System.out.println(simvol4);

        //5
        int necenciindex = message.indexOf("n");
        System.out.println(necenciindex);

        //6
        System.out.println(message.toLowerCase());

        //7
        System.out.println(message.toUpperCase());

        //8
        System.out.println(message.contains("fa"));

        //9
        System.out.println(message.endsWith("r"));

        //10
        System.out.println(message.startsWith("a"));

        //11
        name = " Ayxan ";
        System.out.println(name);

        //12
        System.out.println(name.trim());

        //13
        name = "Kamil";
        System.out.println(name);

        //14
        System.out.println(name.substring(0,4));

        //15
        name = "Hüseyn Mehdizadə";
        System.out.println(name);

        //16
        String[] massiv  = name.split(" ");

        //17
        for (String mass:massiv) {
            System.out.println(mass);
        }

    }
}
