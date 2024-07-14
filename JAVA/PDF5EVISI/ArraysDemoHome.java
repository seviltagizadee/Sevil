package PDF5EVISI;

public class ArraysDemoHome {
    public static void main(String[] args) {
        int[] numbers = {4, 13, 24, 35, 71};
        //1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }

        System.out.println("");

        for (int n : numbers) {
            System.out.print(n + ",");
        }
        System.out.println("");


        //2
        int sum = 0;
        double avarage = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            avarage = sum / numbers.length;
        }
        System.out.println("Avarage : " + avarage);


        //3
        int minimumNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minimumNumber) {
                minimumNumber = numbers[i];
            }
        }
        System.out.println("Minimum number : " +minimumNumber);

      int maxnumber = numbers[0];
      for (int i=0;i<numbers.length;i++){
          if (numbers[i] > maxnumber){
              maxnumber=numbers[i];
          }
      }
        System.out.println("Maximum number : " +maxnumber);



      //4
        for (int i=0;i<numbers.length;i++){
            if ((numbers[i]%2) != 0){
                System.out.println("Odd number : " +numbers[i]);
            }
            if ((numbers[i]%2) ==0){
                System.out.println("Even Number : " +numbers[i]);
            }
        }


        //5
        for (int i=0;i<numbers.length;i++){
            int count =0;
            for(int j=1;j<=numbers[i];j++){
                if (numbers[i]%j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println( "Primitive Number : " +numbers[i]);
            }
        }

        }

    }

