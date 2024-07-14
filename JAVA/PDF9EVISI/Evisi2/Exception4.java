package PDF9EVISI2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception4 {
    public static void main(String[] args) throws IOException {
   Method();
    }
    public static void Method() throws IOException {
        try {
            FileReader file = new FileReader("FILE");
            System.out.println(file.read());
        }catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
    }
    }

