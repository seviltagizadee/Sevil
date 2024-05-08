package PDF4EVISI;

public class MethodsHome {

    public void printNumbers(int begin ,int end){
        for (int i=begin;i<=end;i++){
            System.out.println( i);
        }
    }
    public static void main(String[] args) {
     MethodsHome test1 = new MethodsHome();
     test1.printNumbers(1,10);
        // test1.printNumbers(20,30);
         //test1.printNumbers(15,25);


    }
}
