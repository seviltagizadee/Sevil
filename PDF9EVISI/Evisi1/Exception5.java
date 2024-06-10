package PDF9EVISI1;

import java.util.Scanner;

public class Exception5 {
    public static void main(String[] args) throws OutOfRangeValueException {
   checkNegative(11);
    }
    public static void checkNegative(int a) throws OutOfRangeValueException {

       try {
           if (a<0 && a>10){
               throw  new OutOfRangeValueException("This is OutOfRangeValueException");
           }
       }catch (OutOfRangeValueException exception){
           System.out.println(exception.getMessage());
       }
    }
}
