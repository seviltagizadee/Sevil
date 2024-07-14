package PDF12EVISI1;

public class Main {
    public static void main(String[] args) {
        HelloThreads helloThreads = new HelloThreads();
        HelloThreads helloThreads1 = new HelloThreads();
        helloThreads.start();
        helloThreads1.start();
    }
}
