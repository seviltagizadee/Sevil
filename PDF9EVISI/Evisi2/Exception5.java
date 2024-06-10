package PDF9EVISI2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception5 {
    public static void main(String[] args) throws IOException {
        int[] arr = {10,20,30};
        int a = 5;

        try{
            int result = arr[4]*5;
            result+=a;
    }catch (ArrayIndexOutOfBoundsException | ArithmeticException exception){
            System.out.println(exception.getMessage());
       }

    }}


